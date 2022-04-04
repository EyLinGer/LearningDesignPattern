package pattern.design.strategy.character;

import pattern.design.strategy.behavior.attack.AttackWithSword;

public class Knight extends Character{
    public Knight()
    {
        attackBehavior = new AttackWithSword();
    }
}
