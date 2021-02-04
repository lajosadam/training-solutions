package searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<Integer> integerLista = Arrays.asList(11,3,51,6,8,9,12,55,70);
        Collections.sort(integerLista);

        System.out.println(integerLista);
        System.out.println(integerLista.indexOf(8));
        System.out.println(Collections.binarySearch(integerLista, 51));
        System.out.println(Collections.min(integerLista));
        System.out.println(Collections.max(integerLista));


    }

}
