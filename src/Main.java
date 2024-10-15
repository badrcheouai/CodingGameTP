import productspackage.Electronics;
import productspackage.Food;
import productspackage.Product;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the name of the Product:\n");
        String nameproduct = sc.nextLine();
        System.out.println("Please Enter the price of the Product:\n");
        double priceproduct = sc.nextDouble();
        System.out.println("Please Enter the quantity of the Product:\n");
        int quantityproduct = sc.nextInt();
        System.out.println("Please Enter : \n 1 : a food \n 2 : Electronics \n 3: for no specification");
        int specification = sc.nextInt();
        if (specification == 1) {
            System.out.println("Can you enter the expdate");
            String expdate = sc.nextLine();
            Food example = new Food(nameproduct, priceproduct, quantityproduct, expdate);
            example.displayInfo();
            int quantity = sc.nextInt();
            example.updateQuantity(quantity);
        }
        if (specification == 2) {
            System.out.println("Can you enter the Name of the Brand");
            String brand = sc.nextLine();
            System.out.println("Please Enter the price of the Warranty:\n");
            int warranty = sc.nextInt();
            Electronics example = new Electronics(nameproduct, priceproduct,quantityproduct,brand,warranty);
            example.displayInfo();
            int quantity = sc.nextInt();
            example.updateQuantity(quantity);
        }
        else{
            Product example = new Product(nameproduct, priceproduct, quantityproduct);
            example.displayInfo();
            System.out.println("the quantity to add");
            int quantity = sc.nextInt();
            example.updateQuantity(quantity);
        }
    }
}

