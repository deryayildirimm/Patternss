package OnlineCoffee;

public class FilterCoffee extends OnlineSite{

    public FilterCoffee(){
        description = "OnlineCoffee.FilterCoffee";
    }

    @Override
    public double cost() {

        if (luckyHour()){
            return 20.0 / 2;
        }
        return 20;
    }
}
