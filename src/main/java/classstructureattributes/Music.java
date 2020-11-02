package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Kedvenc zeneszámok adatai");
        System.out.println("Szerző: ");
        song.band = scanner.nextLine();
        System.out.println("Cím: ");
        song.title = scanner.nextLine();
        System.out.println("Hossz: ");
        song.length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A megadott zeneszám adatai: " + song.band + "-" + song.title + "(" + song.length + ")");
    }
}
