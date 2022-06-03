package OnlineCoffee;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract  class OnlineSite implements ISubject{

    String description = "Unknown Beverage";//drink

    public String getDescription() {
        return description;
    }


    private ArrayList<Customer> customers = new ArrayList<>();
    Map<String, String> newCustomer = new HashMap<>();


    @Override
    public void subscribe(Customer sub) {


        customers.add(sub);
        System.out.println(sub.getCustomerName() + " WELCOME!");
        newCustomer.put(sub.getEmail(), sub.customerInfo());
        System.out.println(newCustomer.keySet());


    }

    @Override
    public void unSubscribe(Customer sub) {

        customers.remove(sub);
        System.out.println(sub.getCustomerName() + " are leave us!");
        System.out.println("We hope u will come back soon! Bye ");

        newCustomer.remove(sub.getEmail());


    }


    @Override
    public void notifySubscriber() {


        for (Customer k : customers) {

            System.out.print(k.getCustomerName() + " ");
            k.update();
        }

    }


    public abstract   double cost();

    public boolean  luckyHour() {

        // t is gonna taking from the current time for now
        LocalTime t1 = LocalTime.of(19, 11);
        LocalTime t2 = LocalTime.of(10, 11);
        LocalTime t3 = LocalTime.of(21, 21);
        LocalTime t4 = LocalTime.of(2, 41);


        LocalTime now = LocalTime.now();


        if (now.getHour() == t1.getHour() || now.getHour() == t2.getHour()
                ||now.getHour() == t3.getHour() || now.getHour() == t4.getHour()) {

            notifySubscriber();

            return true;
        }
        return false;
    }
}
