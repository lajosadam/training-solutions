package collectionsset;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorldFilter {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Set<String> filterWords(String... randomStrings){
        Set<String> s = new TreeSet<>();

        for (String i : randomStrings){
            s.add(i);
        }
        return s;
    }

    public static void main(String[] args) {

        WorldFilter obj = new WorldFilter();
        System.out.println(obj.filterWords("w", "a", "z", "g", "L", "k", "B"));



    }

}
