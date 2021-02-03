package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public List<Integer> createList(int... numbers){
        List<Integer> returnList = new ArrayList<>();
        for (int num : numbers){
            returnList.add(num);
        }
        return returnList;
    }

    public int sumIntegerList(List<Integer> integerList){
        int sum = 0;
        for (int nums : integerList){
          sum += nums;
        }
        return sum;
    }

    public int sumIntegerObjects(Integer... integers){
        Integer returnValue = 0;
        for (int nums : integers){
            returnValue += nums;
        }
        return returnValue;
    }

    public static void main(String[] args) {

        Autoboxing box = new Autoboxing();

        System.out.println(box.createList(1,2,3,4,5));
        System.out.println(box.sumIntegerList(List.of(4,6,2,3,9)));
        Integer x = 12;
        Integer y = 63;
        Integer z = 5;
        System.out.println(box.sumIntegerObjects(x, y, z));

    }

}
