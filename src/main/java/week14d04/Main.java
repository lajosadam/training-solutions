package week14d04;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = List.of(1,2,3,4,5,6,7,7);
        ContactCreator creator = new ContactCreator(lista, "Zolika");

        System.out.println(creator);
    }
}
