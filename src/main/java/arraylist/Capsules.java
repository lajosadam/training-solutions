package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {

    List<String> arrayList = new ArrayList<>();

    public void addLast(String parameter){
        arrayList.add(parameter);
    }
    public void addFirst(String parameter){
        arrayList.add(0, parameter);
    }
    public void removeFirst(){
        arrayList.remove(0);
    }
    public void removeLast(){
        arrayList.remove(arrayList.size()-1);
    }

    public static void main(String[] args) {

        Capsules peldany = new Capsules();
        peldany.arrayList.add("Sárga");
        peldany.arrayList.add("Kék");
        peldany.arrayList.add("Piros");
        peldany.arrayList.add("Zöld");
        peldany.arrayList.add("Fekete");

        System.out.println(peldany.arrayList);
        peldany.addLast("NARANCS");
        System.out.println(peldany.arrayList);
        peldany.addFirst("FEHÉR");
        System.out.println(peldany.arrayList);
        peldany.removeFirst();
        System.out.println(peldany.arrayList);
        peldany.removeLast();
        System.out.println(peldany.arrayList);

    }

}
