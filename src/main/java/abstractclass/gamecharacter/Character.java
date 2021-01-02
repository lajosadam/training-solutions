package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint;
    private Random random;
    private boolean isAlive;

    public Character(Point position, Random random, boolean isAlive) {
        this.position = position;
        this.hitPoint = 100;
        this.random = random;
        this.isAlive = isAlive;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    protected int getActualPrimaryDamage(){
        Random rnd = new Random();
        return (rnd.nextInt(10) + 1);
    }

    private int getActualDefence(){
        Random rnd = new Random();
        return rnd.nextInt(6);
    }

    protected void hit(Character enemy, int damage){
        if (getActualDefence() < damage){
            decreaseHitPoint(damage);
        }

    }

    private void decreaseHitPoint(int diff){
        hitPoint -= diff;
    }

    public void primaryAttack(Character enemy){
        hit(enemy,  getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character enemy);

}
