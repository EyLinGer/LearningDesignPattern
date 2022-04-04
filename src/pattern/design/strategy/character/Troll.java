package pattern.design.strategy.character;

import pattern.design.strategy.behavior.attack.AttackWithAxe;

public class Troll extends Character{
    public Troll()
    {
        attackBehavior = new AttackWithAxe();
    }
}
