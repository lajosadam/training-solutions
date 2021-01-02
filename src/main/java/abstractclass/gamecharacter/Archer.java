package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{

    private int numberOfArrow;

    public Archer(Point position, int hitPoint, Random random, boolean isAlive) {
        super(position, hitPoint, random, isAlive);
        this.numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage(){
        Random rnd = new Random();
        return (rnd.nextInt(5) +1);
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
