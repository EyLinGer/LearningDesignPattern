package pattern.design.duck;

public class RedHeadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display()
    {
        System.out.println("Red Head Duck!");
    }

    @Override
    public void fly()
    {
        System.out.println("Red Head Duck Fly!");
    }

    @Override
    public void quack()
    {
        System.out.println("Red Head Duck Quack!");
    }
}
