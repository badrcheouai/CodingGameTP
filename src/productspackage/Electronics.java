package productspackage;

public class Electronics extends Product {
    private final String brand;
    private int warranty;

    public Electronics(String name, Double price, int quantity, String brandip, int warranty) {
        super(name, price, quantity);
        this.brand = brandip;
        this.warranty = warranty;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty);
    }
}
