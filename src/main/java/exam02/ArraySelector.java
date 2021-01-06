package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySelector {

    private int[] objects;
    private String returnedString = "";


    public String selectEvens(int[] objects) {
        this.objects = objects;

        if (objects.length == 0) {
            return returnedString;
        } else {
            List<Integer> objectCopy = new ArrayList<>();
            int x = 0;
            for (int i = 0; i < objects.length; i = i + 2) {
                    objectCopy.add(objects[i]);
            }
           return Arrays.toString(objectCopy.toArray());
        }
    }

    public static void main(String[] args) {

        System.out.println( new ArraySelector().selectEvens(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
