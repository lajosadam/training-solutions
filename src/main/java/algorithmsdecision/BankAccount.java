package algorithmsdecision;

import java.util.List;

public class BankAccount {

    private String name;

    private String accountNumber;

    private int amount;

    public BankAccount(String name, String accountNumber, int amount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) {
        this.amount -= amount;
    }

    public static boolean isHigher(List<BankAccount> lista, int par){
        boolean value = false;
            for (BankAccount i : lista){
                if (i.amount > par){
                    value = true;
                }
            }
        return value;
    }

    public static void main(String[] args) {

        List<BankAccount> lista = List.of(
                new BankAccount("Zolika", "112345-445691", 500_000),
                new BankAccount("Zsófi", "112345-445691", 200_000),
                new BankAccount("Géza", "112345-445691", 1500_000),
                new BankAccount("Tünde", "112345-445691", 300_000)
        );

        boolean value = BankAccount.isHigher(lista, 700_000);
        System.out.println(value);

    }

}
