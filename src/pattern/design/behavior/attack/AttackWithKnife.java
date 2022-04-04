package pattern.design.behavior.attack;

public class AttackWithKnife implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attack with a knife");
    }
}
