public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }

    public abstract void showDetails();

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public String printPricedItem(int quantity) {
        return quantity + " x " + type + " = " + getSalesPrice(quantity);
    }
}
