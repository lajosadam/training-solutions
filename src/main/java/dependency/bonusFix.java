package dependency;

public class bonusFix implements bonusCalculator{

    @Override
    public int bonus(int salary) {
        return salary + 20_000;
    }
}
