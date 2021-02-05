package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mennyi 2+2?");
        int userResult1 = scanner.nextInt();
        scanner.nextLine();
        if (userResult1 == 4){
            System.out.println("Helyes!");
        }else{
            System.out.println("Hibás");
        }

        System.out.println("Mennyi 6/2?");
        int userResult2 = scanner.nextInt();
        scanner.nextLine();
        if (userResult2 == 3){
            System.out.println("Helyes!");
        }else{
            System.out.println("Hibás");
        }

    }

}
