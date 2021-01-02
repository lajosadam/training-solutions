package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        boolean value = false;
        if ((attacker.getHitPoint() > 0) && (defender.getHitPoint() > 0)){
            value = true;
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return value;
    }

    public Character fight(Character one, Character other){

    }
}
