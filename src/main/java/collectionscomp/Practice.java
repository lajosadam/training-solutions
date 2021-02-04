package collectionscomp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<Objektum> lista = Arrays.asList(
                new Objektum("Jani", 1980),
                new Objektum("Géza", 1990),
                new Objektum("Pityu", 2010),
                new Objektum("Vinnetou", 1967)
        );

        Collections.sort(lista);
        System.out.println(lista);

        Collections.sort(lista, new Comparator<Objektum>() {
            @Override
            public int compare(Objektum o1, Objektum o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        System.out.println(lista);
    }

}
