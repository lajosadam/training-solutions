package stringconcat;

public class Employee {

    private String name;

    private String job;

    private int salary;

    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name + " - " + job + " - " + salary + " Ft";
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520_000 );

        System.out.println(employee.toString());
    }
}
