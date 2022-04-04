package pattern.design.strategy.behavior.attack;

public class AttachWithAxe implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attach with axe!");
    }
}
