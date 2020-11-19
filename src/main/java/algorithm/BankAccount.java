package algorithm;

import java.util.ArrayList;
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

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        List<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount("Zolika", "11770043-55669877-00000000", 600_000));
        accountList.add(new BankAccount("Petike", "11770043-65447811-00000000", 400_000));
        accountList.add(new BankAccount("Gézuka", "11770043-36798501-00000000", 60_000));
        accountList.add(new BankAccount("Pistike", "11770043-02874596-00000000", 10_000));

        BankAccountConditionCounter counter = new BankAccountConditionCounter();
        System.out.println("Accountok száma, amelyek aktuális egyenlege meghaladja a paraméter értékét: " + counter.counter(accountList, 80_000));

    }
}
