package inherit;

public interface BossSalaryCalculatorService extends SalaryCalculatorService{

    @Override
    default void raiseSalary(double percent){

    }
}
