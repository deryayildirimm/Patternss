package OnlineCoffee;

public interface PaymentStrategy {
    void payment();
}

class CreditCard implements PaymentStrategy{


    public void payment(){

        System.out.println("The customer  pay with Credit Card!");
    }


}
class Bitcoin implements PaymentStrategy{

    public void payment(){

        System.out.println("The customer  pay with OnlineCoffee.Bitcoin!");
    }
}
class PayPal implements PaymentStrategy {

    public void payment() {

        System.out.println("The customer  pay with OnlineCoffee.PayPal!");
    }
}

