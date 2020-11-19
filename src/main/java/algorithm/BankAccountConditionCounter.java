package algorithm;

import java.util.List;

public class BankAccountConditionCounter {
    public int counter(List<BankAccount> accountList, int parameter){
        int count = 0;
        for (BankAccount i : accountList){
            if (i.getBalance() > parameter){
                count++;
            }
        }
        return count;
    }
}
