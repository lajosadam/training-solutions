package classstructureintegrate;

import java.io.ObjectInput;
import java.lang.reflect.Array;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void transfer(int amount){
        this.balance -= amount;
    }

    public String getInfo(){
        return this.owner + " " + "("+this.accountNumber+"): " + this.balance + " Ft";
    }
}
