package productspackage;

public class Product{

    private final String name;
    private  Double price;
    private  int quantity;

    public Product(String name, Double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    };

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public void updateQuantity(int newQuantity){
        quantity = newQuantity;

    }
    public void updateQuantity(int addedQuantity, boolean addToExisting){
        if (addToExisting){
            quantity += addedQuantity;
            return;
        }
        quantity = addedQuantity;
    }
    public double getPrice(){
        return price;
    }
    public static void welcomeMessage(){
        System.out.println("Welcome to Product");
    }
}


