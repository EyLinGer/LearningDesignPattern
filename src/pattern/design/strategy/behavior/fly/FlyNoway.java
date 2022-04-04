package pattern.design.strategy.behavior.fly;

public class FlyNoway implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can not fly!");
    }
}
