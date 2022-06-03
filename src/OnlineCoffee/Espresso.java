package OnlineCoffee;

public class Espresso extends OnlineSite {

    public Espresso(){
        description = "OnlineCoffee.Espresso";
    }

    @Override
    public double cost() {

        if (luckyHour()){
            return 32.50 /2 ;
        }

        return 32.50;
    }
}
