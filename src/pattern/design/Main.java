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
    }
}
