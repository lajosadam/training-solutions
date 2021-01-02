package inherit;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String address) {
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
        salary = salary * percent;
    }
}
