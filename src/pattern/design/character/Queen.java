package pattern.design.character;

import pattern.design.behavior.attack.AttackWithKnife;

public class Queen extends Character{
    public Queen()
    {
        attackBehavior = new AttackWithKnife();
    }
}
