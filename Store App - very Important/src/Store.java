import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ProductForSale> products = new ArrayList<>();
        ArrayList<OrderItem> orderItems = new ArrayList<>();

        // Insert my products
        products.add(new Toy());
        products.add(new Bike());


        while (true) {
            seeAction();
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                seeProducts(products);
            }
            else if (choice.equals("2")) {
                System.out.println("Adding product...");
                System.out.println("Enter product name: ");
                String name = sc.next();
                System.out.println("Enter product quantity: ");
                int quantity = sc.nextInt();

                if (name.equals("Toy")){
                    addOrderItem(new OrderItem(quantity, products.get(0)), orderItems);
                } else if (name.equals("Bike")){
                    addOrderItem(new OrderItem(quantity, products.get(1)), orderItems);
                } else {
                    System.out.println("Invalid product.");
                }
            }
            else if (choice.equals("3")) {
                System.out.println("Removing product...");
                System.out.println("Enter product name: ");
                String name = sc.next();
                OrderItem orderToRemove = findOderItem(name, orderItems);
                if (orderToRemove != null) {
//                    orderItems.remove(orderToRemove);
                    removeOrderItem(name, orderItems);
                    System.out.println("Removed product.");
                } else {
                    System.out.println("Invalid product.");
                }
            }
            else if (choice.equals("4")) {
                printReceipt(orderItems);
            }
            else if (choice.equals("0")) {
                System.out.println("Goodbye.");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public static void addOrderItem(OrderItem orderItem, ArrayList<OrderItem> orderItems) {
        OrderItem orderToAdd = findOderItem(orderItem.getProduct().getType(), orderItems);
        if (orderToAdd == null) {
            orderItems.add(orderItem);
            System.out.println("Added product.");
        }
        System.out.println("Already Existing product.");

    }

    public static void removeOrderItem(String type, ArrayList<OrderItem> orderItems) {
        OrderItem orderItemToRemove = findOderItem(type, orderItems);
        if (orderItemToRemove != null) {
            orderItems.remove(orderItemToRemove);
            System.out.println("Removed product.");
        }
        System.out.println("No existing product.");
    }

    public static OrderItem findOderItem(String type, ArrayList<OrderItem> orderItems) {
        for (OrderItem orderItem : orderItems) {
            if (type.equals(orderItem.getProduct().getType())){
                return orderItem;
            }
        }
        return null;
    }

    public static void seeProducts(ArrayList<ProductForSale> products) {
        System.out.println("Products Available: ");
        for (ProductForSale product : products) {
            System.out.println("Product: " + product.getType() + " Price " + product.price);
        }
        System.out.println();
    }

    public static void seeAction(){
        System.out.println("""
                1) See available products
                2) Choose product
                3) Remove product
                4) Print receipt
                0) Exit
                
                Please Enter Your Choice \n
                """);
    }

    public static void printReceipt(ArrayList<OrderItem> orderItems) {
        for (OrderItem orderItem : orderItems) {
            orderItem.getProduct().showDetails();
        }
        double totalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            double price = orderItem.getProduct().getSalesPrice(orderItem.getQuantity());
            System.out.println(orderItem.getProduct().printPricedItem(orderItem.getQuantity()));
            totalPrice += price;
        }
        System.out.println("Total Price: " + totalPrice + "$");
        System.out.println();
    }

}
