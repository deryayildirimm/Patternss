
public class App {

    public static void main(String[] args) {

        System.out.println(" *** Welcome to the Coffee Shop! *** ");

        System.out.println("There is some luck hours to discount for %50!");
        System.out.println("Lucky Times ==> 19.00-19.59  02.00-02.59  20.00-20.59 - 10.00-10.59");

        System.out.println("-----------------------------------");
        System.out.println("TEST CASE -1 : \nSubscribe the online site and order an coffee!\n If it's lucky time You will be know! ");
        System.out.println("-----------------------------------\n");



        Customer s = new Customer("Derya", "derya@hotmail.com",  1458);

        Customer s2 = new Customer("Buse", "bsue@hotmail.com", 4521);

        Customer s3 = new Customer("Semih", "semih@hotmail.com", 4521);

        Customer s4 = new Customer("Cenk", "cenkKazım@hotmail.com", 4521);

        Customer s5 = new Customer("Ilayda", "ilayda@hotmail.com", 4521);


        OnlineSite site = new Americano();

        site.subscribe(s);
        site.subscribe(s2);

        site.subscribe(s5);

        site.unSubscribe(s5);

        site.luckyHour();

        site = new Americano();
        site = new Sugar(site);
        site = new Sugar(site);


        System.out.print("The customer want to buy : ");
        System.out.println(site.getDescription() + " - " + site.cost());


        System.out.println("How you gonna pay?");

        s.setPayment(new CreditCard());

        System.out.println("Total cost : "+site.cost() +"\nDo you wanna add something?  ==> NO");

        System.out.println("For the payment process ...");


        System.out.println("We need credit Card info for shopping ");
        System.out.print("The user type the number ... ==>\t" );
        s.setCardNumber(45698736);
        System.out.println(s.getCardNumber());
        s.pay();

        System.out.println("\n-----------------------------------");
        System.out.println("TEST CASE -2 : \nUnsubscribe the online site because don't wanna info anymore.\nCheck if u gonna take notification or not. ");
        System.out.println("-----------------------------------\n");


        OnlineSite filter = new FilterCoffee();
        filter.subscribe(s3);
        filter.subscribe(s4);
        filter.unSubscribe(s);
        filter.unSubscribe(s2);
        filter.luckyHour();
        System.out.println("One of them decide to buy something!");

        filter = new Milk(filter);

        System.out.print("The customer want to buy : \n");
        System.out.println(filter.getDescription() + " - " + filter.cost());

        System.out.println("How you gonna pay?");

        s4.setPayment(new Bitcoin());

        s4.pay();




    }
}
