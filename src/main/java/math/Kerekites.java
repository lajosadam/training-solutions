package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kerekites {

    public static void main(String[] args) {
        Random rnd = new Random();

        float minX = 0.00000f;
        float maxX = 1000.00000f;

        float random = rnd.nextFloat()  * (maxX - minX) + minX;
        System.out.println(random);

        List<Float> floatList = new ArrayList<>();

        for (int i=0; i<1001; i++){
            float random2 = rnd.nextFloat()  * (maxX - minX) + minX;
            floatList.add(random2);
        }

        float value = 0.00000f;
        for (float i : floatList){
            value += i;
        }

        System.out.println(value);
    }

}
