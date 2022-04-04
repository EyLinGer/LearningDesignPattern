package pattern.design.strategy;

import pattern.design.strategy.behavior.attack.AttachWithAxe;
import pattern.design.strategy.behavior.attack.AttackWithBowAndArrow;
import pattern.design.strategy.behavior.attack.AttackWithKnife;
import pattern.design.strategy.behavior.attack.AttackWithSword;
import pattern.design.strategy.character.*;
import pattern.design.strategy.character.Character;

public class GameExample {
    public void run()
    {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();

        king.setAttackBehavior(new AttackWithKnife());
        queen.setAttackBehavior(new AttackWithBowAndArrow());
        knight.setAttackBehavior(new AttachWithAxe());
        troll.setAttackBehavior(new AttackWithSword());

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();
    }
}
