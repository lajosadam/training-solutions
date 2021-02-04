package week14d04;

import java.util.List;

public class ContactCreator {

    private List<Integer> monthlyPrices;
    private String name;

    public ContactCreator(List<Integer> monthlyPrices, String name) {
        this.monthlyPrices = monthlyPrices;
    }

    public void create(String name){
        this.name = name;
    }

}
