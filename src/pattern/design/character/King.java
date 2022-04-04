package pattern.design.character;

import pattern.design.behavior.attack.AttackWithBowAndArrow;

public class King extends Character{
    public King()
    {
        attackBehavior = new AttackWithBowAndArrow();
    }
}
