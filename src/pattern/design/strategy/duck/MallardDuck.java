package pattern.design.strategy.duck;

import pattern.design.strategy.behavior.fly.FlyWithWings;
import pattern.design.strategy.behavior.quack.Quack;

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
