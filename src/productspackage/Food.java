package productspackage;

public class Food extends Product {
    private String expDate;

    public Food(String name, Double price, int quantity, String expDate) {
        super(name, price, quantity);
        this.expDate = expDate;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("expiration Date: " + expDate);
    }
}
