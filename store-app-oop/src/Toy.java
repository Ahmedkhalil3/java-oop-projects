public class Toy extends ProductForSale{
    public Toy() {
        super("Toy", 5.99, "Durable and colorful car toy for kids");
    }

    @Override
    public void showDetails() {
        System.out.printf("Type: %s | Price: $%.2f | Description: %s%n", type, price, description);
    }

}
