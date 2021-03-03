package algorithmssum;

import java.util.Arrays;
import java.util.List;

public class Salesperson {
    private String name;

    private int amount;

    public Salesperson(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public static int sumMethod(List<Salesperson> person){
        int sum = 0;

            for (Salesperson i : person){
                sum += i.getAmount();
            }

        return sum;
    }

    public static void main(String[] args) {

        List<Salesperson> lista = List.of(
            new Salesperson("Zolika", 20_000),
            new Salesperson("Gézuka", 40_0000),
            new Salesperson("Zsófi", 100_000)
        );

        int value = Salesperson.sumMethod(lista);

        System.out.println(value);
    }
}
