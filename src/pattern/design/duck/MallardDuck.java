package pattern.design.duck;

import pattern.design.behavior.fly.FlyWithWings;
import pattern.design.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display()
    {
        System.out.println("Mallard Duck!");
    }
}
