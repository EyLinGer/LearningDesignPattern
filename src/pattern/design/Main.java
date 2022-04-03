package pattern.design;

import pattern.design.duck.Duck;
import pattern.design.duck.MallardDuck;
import pattern.design.duck.RedHeadDuck;
import pattern.design.duck.RubberDuck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck();
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        duck.display();
        mallardDuck.display();
        redHeadDuck.display();
        rubberDuck.display();

        MallardDuck mallardDuck1 = new MallardDuck();
        mallardDuck1.fly();
        mallardDuck1.quack();

        RedHeadDuck redHeadDuck1 = new RedHeadDuck();
        redHeadDuck1.fly();
        redHeadDuck1.quack();
    }
}
