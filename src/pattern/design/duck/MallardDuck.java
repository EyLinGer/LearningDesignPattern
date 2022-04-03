package pattern.design.duck;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display()
    {
        System.out.println("Mallard Duck!");
    }
    @Override
    public void fly()
    {
        System.out.println("Mallard Duck Fly!");
    }
    @Override
    public void quack()
    {
        System.out.println("Mallard Duck Quack!");
    }
}
