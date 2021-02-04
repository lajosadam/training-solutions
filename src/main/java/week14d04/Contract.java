package week14d04;

import java.util.List;

public class Contract {
    private String client;                  //szerződő neve
    private List<Integer> monthlyPrices;    //havonta fizetendő összeg

    public Contract(String client, List<Integer> monthlyPrices) {
        this.client = client;
        this.monthlyPrices = monthlyPrices;
    }
}
