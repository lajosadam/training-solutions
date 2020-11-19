package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    private Random random = new Random();
    private int randomNumber = random.nextInt(100+1);

    public int getRandomNumber() {
        return randomNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a számot: ");
        int scannedNumber = scanner.nextInt();
        scanner.nextLine();
        NumberGuesser numberGuesser = new NumberGuesser();
        System.out.println("Amire gondolt a gép: " + numberGuesser.getRandomNumber());

        while (numberGuesser.getRandomNumber() != scannedNumber){
            System.out.println("Nem talált! Kérem az új számot: ");
            scannedNumber = scanner.nextInt();
            if (scannedNumber == numberGuesser.getRandomNumber()){
                System.out.println("Dőzs!");
            }
        }

    }
}
