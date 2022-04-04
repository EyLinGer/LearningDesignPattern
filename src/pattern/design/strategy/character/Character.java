package pattern.design.strategy.character;

import pattern.design.strategy.behavior.attack.AttackBehavior;

public class Character {
    protected AttackBehavior attackBehavior;
    public void fight()
    {
        attackBehavior.attack();
    }
    public void setAttackBehavior(AttackBehavior ab)
    {
        attackBehavior = ab;
    }
}
