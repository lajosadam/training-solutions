package collectionsqueue;

import java.util.LinkedList;
import java.util.Queue;

public class JobDispatcher {

    public static void main(String[] args) {

        Queue<String> feladatok = new LinkedList<>();

        feladatok.add("Mosogatás");
        feladatok.add("Takarítás");
        feladatok.add("Porszívózás");
        feladatok.add("Autómosás");
        feladatok.add("Plusz feladat");

        for (int i=feladatok.size(); i>0; i--){
            System.out.println("A feladat: " + feladatok.element());
            feladatok.remove();
            }
        }

}
