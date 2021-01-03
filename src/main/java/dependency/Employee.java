package dependency;

public class Employee {

    private int salary;

    private bonusCalculator bonuscalCulator;

    public Employee(int salary, bonusCalculator bonuscalCulator) {
        this.salary = salary;
        this.bonuscalCulator = bonuscalCulator;
    }

    public int bonus() {
        return bonuscalCulator.bonus(salary);
    }
}
