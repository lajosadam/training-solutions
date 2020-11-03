package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Product name: ");
        String pName = scanner.nextLine();
        System.out.println("Price: ");
        int pPrice = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(pName, pPrice);
        System.out.println("Product: "+product.getName()+", Price: "+product.getPrice());

    }
}
