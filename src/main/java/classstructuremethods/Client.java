package classstructuremethods;

public class Client {
    private String name;
    private int year;
    private String adress;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void migrate(String adress) {
        this.adress = adress;
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAdress() {
        return adress;
    }
}
