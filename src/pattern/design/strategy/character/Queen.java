package pattern.design.strategy.character;

import pattern.design.strategy.behavior.attack.AttackWithKnife;

public class Queen extends Character{
    public Queen()
    {
        attackBehavior = new AttackWithKnife();
    }
}
