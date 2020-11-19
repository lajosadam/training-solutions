package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "A legidősebb oktató: " +
                name + ", kor = " + age;
    }

    public static void main(String[] args) {

        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("Zolika", 26));
        trainers.add(new Trainer("Petike", 50));
        trainers.add(new Trainer("Gézuka", 32));
        trainers.add(new Trainer("Pityu", 46));

        MaxAgeCalculator calculator = new MaxAgeCalculator();
        System.out.println(calculator.trainerWithMaxAge(trainers).toString());
        System.out.println("Van-e olyan oktató, aki 50 évnél idősebb: " + calculator.trainerWithMinAge(trainers, 50));

    }
}
