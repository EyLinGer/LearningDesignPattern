package pattern.design.decorator;

public class DarkRoast extends Beverage{
    public DarkRoast()
    {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
