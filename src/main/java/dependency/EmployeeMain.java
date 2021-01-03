package dependency;

public class EmployeeMain {

    public static void main(String[] args) {

        bonusFix fix = new bonusFix();
        bonusTriple triple = new bonusTriple();

        Employee firstEmployee = new Employee(50_000, fix);
        System.out.println(firstEmployee.bonus());

        Employee secondEmployee = new Employee(50_000, triple);
        System.out.println(secondEmployee.bonus());

    }
}
