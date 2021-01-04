package interfaceTraining;

public class Animal implements animalHasName, animalAgeAndYearOfBirth{

    int age;
    int yearOfBirth;
    String name;

    public Animal(int age, int yearOfBirth, String name) {
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.name = name;
    }

    @Override
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
