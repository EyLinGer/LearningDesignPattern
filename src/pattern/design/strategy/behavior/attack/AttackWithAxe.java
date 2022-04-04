package pattern.design.strategy.behavior.attack;

public class AttackWithAxe implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attack with axe!");
    }
}
