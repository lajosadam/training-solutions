package interfaces;

public class Lion implements Animal{

    private int numberOflegs = 4;
    private String name = "Lion";

    @Override
    public int getNumberofLegs() {
        return numberOflegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
