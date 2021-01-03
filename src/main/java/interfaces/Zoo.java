package interfaces;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Animal duck = new Duck();
        Animal lion = new Lion();
        Animal worm = new Worm();

        animals.add(duck);
        animals.add(lion);
        animals.add(worm);

        for (Animal a : animals){
            System.out.println(a.getName() + " " + a.getNumberofLegs());
        }

    }

}
