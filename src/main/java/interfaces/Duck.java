package interfaces;

public class Duck implements Animal{

    private int numberofLegs = 2;
    private String name = "Duck";

    @Override
    public int getNumberofLegs() {
        return numberofLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
