package pattern.design.strategy;

public class StrategyPattern {
    public void run()
    {
        DuckExample duckExample = new DuckExample();
        duckExample.run();
        System.out.println("----------");
        GameExample gameExample = new GameExample();
        gameExample.run();
    }
}
