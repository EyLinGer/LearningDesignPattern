package pattern.design.strategy.duck;

import pattern.design.strategy.behavior.fly.FlyWithWings;
import pattern.design.strategy.behavior.quack.Squeak;

public class RedHeadDuck extends Duck{
    public RedHeadDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }
    @Override
    public void display()
    {
        System.out.println("Red Head Duck!");
    }
}
