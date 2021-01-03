package interfaces;

public class Worm implements Animal{

    private int numberOflegs = 0;
    private String name = "Worm";

    @Override
    public int getNumberofLegs() {
        return numberOflegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
