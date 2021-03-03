package algorithmscount;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class BankAccount {

    private String nameOfOwner;

    private String accountNumber;

    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static int bankAccountConditionCounter(List<BankAccount> persons, int osszegHatar){
        int count = 0;

            for (BankAccount i : persons){
                if (i.balance > osszegHatar){
                    count++;
                }
            }
        return count;
    }

    public static void main(String[] args) {

        List<BankAccount> lista = List.of(
                new BankAccount("Zolika", "11-22-44", 50_000),
                new BankAccount("Géza", "11-41-44", 150_000),
                new BankAccount("Pityu", "11-33-44", 30_000),
                new BankAccount("Zsófi", "11-89-44", 350_000)
        );

        int value = BankAccount.bankAccountConditionCounter(lista, 40000);
        System.out.println(value);

    }
}
