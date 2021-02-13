package introexception;

public class Patient {

    private String name;

    private String TAJszam;

    private int yearOfBirth;

    public Patient(String name, String TAJszam, int yearOfBirth) {
        this.name = name;
        this.TAJszam = TAJszam;
            if (yearOfBirth < 1920 || yearOfBirth > 2021){
                throw new IllegalArgumentException("Hibás születési dátum!!!");
            }else {
                this.yearOfBirth = yearOfBirth;
            }
    }


    public String getName() {
        return name;
    }

    public String getTAJszam() {
        return TAJszam;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        Patient patient = new Patient("Zolika", "041-555-889", 2050);

    }
}
