package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a felhasználó nevet: ");
        String username = scanner.nextLine();
        System.out.println("Kérem a jelszót: ");
        String password1 = scanner.nextLine();
        System.out.println("Kérem a jelszót újra: ");
        String password2 = scanner.nextLine();
        System.out.println("Kérem az e-mail címet: ");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        if (userValidator.isValidUsername(username) || userValidator.isValidPassword(password1, password2) || userValidator.isValidEmail(email)) {
            System.out.println("A regisztráció sikeres");
        } else {
            System.out.println("A regisztráció sikertelen");
        }


    }
}
