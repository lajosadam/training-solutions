package dependency;

public class bonusTriple implements bonusCalculator{

    @Override
    public int bonus(int salary) {
        return salary * 3;
    }
}
