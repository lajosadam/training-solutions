package classstructureio;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét: ");
        String name = scanner.nextLine();

        System.out.println("Kérem adja meg az e-mail címét: ");
        String email = scanner.nextLine();

        System.out.println("A regisztrált adatai: ");
        System.out.println("Név: " + name);
        System.out.println("e-mail cím: " + email);
    }
}