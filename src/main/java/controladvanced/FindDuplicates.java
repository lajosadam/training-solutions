package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {

        List<Integer> szamLista = List.of(1,2,3,3,3,4,5,10,10,51,120);

        int tarolo = 0;

        List<Integer> duplicatedNumbers = new ArrayList<>();

        for (int i : szamLista){
            if (i == tarolo){
                if (!duplicatedNumbers.contains(i)){
                    duplicatedNumbers.add(i);
                }
            }
            tarolo = i;
        }
        System.out.println("Az alábbi számok duplikálódnak a listában: " + duplicatedNumbers);

    }

}
