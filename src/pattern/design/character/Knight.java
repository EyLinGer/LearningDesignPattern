package pattern.design.character;

import pattern.design.behavior.attack.AttackWithSword;

public class Knight extends Character{
    public Knight()
    {
        attackBehavior = new AttackWithSword();
    }
}
