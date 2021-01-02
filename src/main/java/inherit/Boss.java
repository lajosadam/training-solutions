package inherit;

public class Boss extends Person{

    private double salary;
    private final double LEADERSHIP_BONUS = 1.5;

    public Boss(String name, String address) {
        super(name, address);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void raiseSalary(double percent) {
        salary = (salary * percent) * LEADERSHIP_BONUS;
    }


}
