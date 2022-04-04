package pattern.design.behavior.attack;

public class AttackWithSword implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attack with sword!");
    }
}
