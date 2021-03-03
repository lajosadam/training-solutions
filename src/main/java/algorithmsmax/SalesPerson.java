package algorithmsmax;

import java.util.List;

public class SalesPerson {

    private String name;

    private int amount;

    private int target;

    public SalesPerson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }

    public static String bestPerson(List<SalesPerson> lista){
        String name = "";
        int amount = 0;
            for (SalesPerson i : lista){
                if (i.getAmount() > amount){
                    name = i.getName();
                    amount = i.getAmount();
                }
            }
        return name;
    }

    public static void main(String[] args) {

        List<SalesPerson> lista = List.of(
                new SalesPerson("Zolika", 30_000, 120_000),
                new SalesPerson("Gézu", 50_000, 120_000),
                new SalesPerson("Pityu", 90_000, 120_000),
                new SalesPerson("Zsófi", 200_000, 120_000)
        );

        String value1 = SalesPerson.bestPerson(lista);
        System.out.println(value1);
    }

}
