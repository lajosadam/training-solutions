package collectionscomp;

public class Objektum implements Comparable<Objektum>{
    private String name;
    private int yearOfBirth;

    public Objektum(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Objektum o) {
        return this.yearOfBirth - o.yearOfBirth;
    }

    @Override
    public String toString() {
        return "Objektum{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
