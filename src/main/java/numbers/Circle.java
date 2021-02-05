package numbers;

public class Circle {

    private int diameter;

    private final double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter(){
        double result = diameter * PI;
        return result;
    }

    public double area(){
        double r = (double) diameter / 2;
        return r*r*PI;
    }
}
