package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    public AxeWarrior(Point position, int hitPoint, Random random, boolean isAlive) {
        super(position, hitPoint, random, isAlive);
    }

    private int getActualSecondaryDamage(){
        int rnd = new Random().nextInt(2)+1;
        return rnd * getActualPrimaryDamage();
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (Point.distance() < 2){
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
