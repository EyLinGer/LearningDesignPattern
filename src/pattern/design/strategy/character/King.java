package pattern.design.strategy.character;

import pattern.design.strategy.behavior.attack.AttackWithBowAndArrow;

public class King extends Character{
    public King()
    {
        attackBehavior = new AttackWithBowAndArrow();
    }
}
