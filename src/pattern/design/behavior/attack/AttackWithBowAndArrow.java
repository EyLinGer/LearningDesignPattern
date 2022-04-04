package pattern.design.behavior.attack;

public class AttackWithBowAndArrow implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attack with bow and arrow!");
    }
}
