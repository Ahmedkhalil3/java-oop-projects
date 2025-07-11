public class Bike extends ProductForSale {
    public Bike(){
        super("Bike", 150, "Very fast Bike");
    }

    @Override
    public void showDetails() {
        System.out.printf("Type: %s | Price: %.2f | Description: %s%n", type, price, description);
    }
}
