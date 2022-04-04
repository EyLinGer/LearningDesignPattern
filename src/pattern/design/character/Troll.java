package pattern.design.character;

import pattern.design.behavior.attack.AttachWithAxe;

public class Troll extends Character{
    public Troll()
    {
        attackBehavior = new AttachWithAxe();
    }
}
