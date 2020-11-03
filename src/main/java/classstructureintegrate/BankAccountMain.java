package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Account name: ");
        String owner = scanner.nextLine();

        System.out.println("Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Balance: ");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);
        System.out.println("Default balance: "+bankAccount.getInfo());

        BankAccount bankAccount2 = new BankAccount("10073217-12000098-67341590", "Pityu", 1000);

        bankAccount.deposit(25000);
        System.out.println("Deposit balance: "+bankAccount.getInfo());

        bankAccount.withdraw(10000);
        System.out.println("Withdraw balance: "+bankAccount.getInfo());

        System.out.println("Transfer amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Target account number: ");
        String targetAccount = scanner.nextLine(); /* vezérlő szerkezet nélkül nem tudok egyezést keresni*/
        System.out.println("Target Balance: "+bankAccount2.getBalance());

        bankAccount.transfer(amount);
        System.out.println("Balance: "+bankAccount.getBalance());
        bankAccount2.deposit(amount);
        System.out.println("Target balance after transfer: "+bankAccount2.getBalance());
    }
}
