package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Számla száma: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Tulajdonos: ");
        String owner = scanner.nextLine();

        System.out.println("Nyitó összeg: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount firstAccount = new BankAccount(accountNumber, owner, amount);

        System.out.println("2. Számla száma: ");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Tulajdonos: ");
        String owner2 = scanner.nextLine();

        System.out.println("Nyitó összeg: ");
        int amount2 = scanner.nextInt();

        BankAccount secondAccount = new BankAccount(accountNumber2, owner2, amount2);

        System.out.println(firstAccount.getInfo());
        System.out.println(secondAccount.getInfo());

        System.out.println("Mennyit szeretne befizetni az első számlára?");
        int depositAmount = scanner.nextInt();
        firstAccount.deposit(depositAmount);

        System.out.println(firstAccount.getInfo());

        System.out.println("Mennyit szeretne felvenni a második számláról?");
        int withdrawAmount = scanner.nextInt();
        secondAccount.withdraw(withdrawAmount);

        System.out.println(secondAccount.getInfo());

        System.out.println("Mennyit szeretne átutalni az első számláról a másodikra?");
        int transferAmount = scanner.nextInt();
        firstAccount.transfer(secondAccount, transferAmount);

        System.out.println(firstAccount.getInfo());
        System.out.println(secondAccount.getInfo());
    }
}
