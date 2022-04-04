package pattern.design.strategy.character;

import pattern.design.strategy.behavior.attack.AttachWithAxe;

public class Troll extends Character{
    public Troll()
    {
        attackBehavior = new AttachWithAxe();
    }
}
