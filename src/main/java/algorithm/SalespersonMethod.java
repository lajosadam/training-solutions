package algorithm;

import java.util.List;

public class SalespersonMethod {
    public int algorithm(List<Salesperson> salesperson){
        int sum = 0;
        for (Salesperson i : salesperson){
            sum += i.getAmount();
        }
        return sum;
    }
}
