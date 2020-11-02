package classstructureio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Kérem az első számot: ");
        Scanner scanner = new Scanner(System.in);
        int Num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a második számot: ");
        int Num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A művelet: " + Num1 + "+" + Num2);
        int Result = Num1 + Num2;
        System.out.println(Result);



    }
}
