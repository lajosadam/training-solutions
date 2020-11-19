package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private String name;
    private int amount;

    public Salesperson(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        List<Salesperson> salespeople = new ArrayList<>();
        salespeople.add(new Salesperson("Zolika", 25_000));
        salespeople.add(new Salesperson("Petike", 50_000));
        salespeople.add(new Salesperson("Pityuka", 40_000));
        salespeople.add(new Salesperson("Gézuka", 10_000));

        SalespersonMethod algorithmTest = new SalespersonMethod();
        System.out.println("Az összes árbevétel: " + algorithmTest.algorithm(salespeople));
    }
}
