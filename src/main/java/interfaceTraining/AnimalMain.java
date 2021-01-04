package interfaceTraining;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal = new Animal(12, 2018, "Elefánt");
        animalAgeAndYearOfBirth allat = new Animal(5, 2020, "Kakadu");

        System.out.println(animal.getAge());
        System.out.println(animal.getYearOfBirth());
        System.out.println(animal.getName());

        System.out.println(allat.getAge());
        System.out.println(allat.getYearOfBirth());
        // System.out.println(allat.getName());        nincs neki getName metódusa


    }
}
