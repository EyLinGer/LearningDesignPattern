package pattern.design;

import pattern.design.behavior.fly.FlyNoway;
import pattern.design.behavior.quack.MuteQuack;
import pattern.design.duck.Duck;
import pattern.design.duck.MallardDuck;
import pattern.design.duck.RedHeadDuck;
import pattern.design.duck.RubberDuck;

public class DuckExample {
    public void run()
    {
        Duck duck = new Duck();
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        duck.display();
        mallardDuck.display();
        redHeadDuck.display();
        rubberDuck.display();

        mallardDuck.performFly();
        redHeadDuck.performFly();
        rubberDuck.performFly();

        mallardDuck.performQuack();
        redHeadDuck.performQuack();
        rubberDuck.performQuack();

        /*
        为什么要将“飞行”和“喊叫”的实现交给FlyBehavior和QuackBehavior接口代理呢？
        首先，是为了隔离变化。
        其次，其实子类重写父类方法也可以做到运行时表现出不同的行为，
        比如 Duck 类添加 Fly() 和 Quack() 方法，
        RubberDuck类不能飞的话将具体实现换一下就行。
        但是如果这么做的话就做不到下方这种“动态改变某个实例行为”的功能。
        使用这种设计的方式，符合“策略模式”。
         */
        mallardDuck.setFlyBehavior(new FlyNoway());
        redHeadDuck.setQuackBehavior(new MuteQuack());

        mallardDuck.performFly();
        redHeadDuck.performQuack();
    }
}
