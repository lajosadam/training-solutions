import enaplo.Mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zolika {
    List<Integer> marks = Arrays.asList(11, 4, 40);

    public double calculateAverage(){
        double value = 0;
        for (Integer i : marks){
            value += i;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println("    Hexo   World    ".trim().replace("x", "ll").substring(2, 10));
        System.out.println("    Hexo   World    ".trim());
        zolika zolika = new zolika();
        System.out.println(zolika.calculateAverage());
    }
}
