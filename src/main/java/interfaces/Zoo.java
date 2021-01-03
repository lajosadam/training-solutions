package interfaces;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Duck duck = new Duck();
        Lion lion = new Lion();
        Worm worm = new Worm();

        animals.add(duck);
        animals.add(lion);
        animals.add(worm);

        for (Animal a : animals){
            System.out.println(a.getName() + " " + a.getNumberofLegs());
        }

    }

}
