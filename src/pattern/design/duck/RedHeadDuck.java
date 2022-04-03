package pattern.design.duck;

import pattern.design.behavior.fly.FlyWithWings;
import pattern.design.behavior.quack.Squeak;

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
