public class Americano extends OnlineSite{
    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {

        if (luckyHour()){
            return 25.0 / 2;
        }
        return 25;
    }
}
