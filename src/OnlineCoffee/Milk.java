package OnlineCoffee;

public class Milk extends CondimentDecorator {
    OnlineSite beverage;


    public Milk(OnlineSite beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with OnlineCoffee.Milk";
    }

    @Override
    public double cost()
    {
        return beverage.cost() + 1.25;
    }
}
