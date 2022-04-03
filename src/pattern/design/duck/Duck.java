package pattern.design.duck;

import pattern.design.behavior.fly.FlyBehavior;
import pattern.design.behavior.fly.FlyNoway;
import pattern.design.behavior.quack.MuteQuack;
import pattern.design.behavior.quack.QuackBehavior;

public class Duck {
    public Duck()
    {
        flyBehavior = new FlyNoway();
        quackBehavior = new MuteQuack();
    }
    public void display()
    {
        System.out.println("Duck!");
    }
    protected FlyBehavior flyBehavior;
    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }
    public void performFly()
    {
        flyBehavior.fly();
    }
    protected QuackBehavior quackBehavior;
    public void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }
    public void performQuack()
    {
        quackBehavior.quack();
    }
}
