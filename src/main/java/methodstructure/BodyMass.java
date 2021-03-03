package methodstructure;

public class BodyMass {

    private double weight = 92;

    private double height = 172;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    double bodyMassIndex(){
        return weight / (height * height);
    }

}
