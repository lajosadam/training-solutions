package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString){
        int sum = 0;
        List<Integer> lista = new ArrayList<>();
        Scanner inputString = new Scanner(intString);

        while (inputString.hasNextInt()){
            lista.add(inputString.nextInt());
        }

        for (int i : lista){
            sum += i;
        }

        return sum;
    }

    public int readAndSumValues(String intString, String delimiter){
        int sum = 0;

        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word){
        String filter = "";

        return filter;
    }

    public static void main(String[] args) {

        int zolika = new StringScanner().readAndSumValues("12 11 50 6");

        System.out.println(zolika);

    }

}
