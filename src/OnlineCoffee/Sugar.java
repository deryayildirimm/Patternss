package OnlineCoffee;

public class Sugar extends CondimentDecorator {

    OnlineSite beverage;

    public Sugar(OnlineSite beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with OnlineCoffee.Sugar ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.00;
    }

}
