public class Customer implements IObserver{
    PaymentStrategy payment ;
    private  String customerName ;
    private   String email;
    private int password;
    private int cardNumber;


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {


        this.cardNumber = cardNumber;
    }


    public int  getPassword() {
        return password;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getEmail() {
        return email;
    }

    public String customerInfo(){

        return " Name : "+getCustomerName() + " Email : " +getEmail() +
                " Card Number : "+ getCardNumber();

    }


    public Customer(String customerName, String email, int password ) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;

    }

    public void setPayment(PaymentStrategy payment) {

        this.payment = payment;
        payment.payment();
    }


    public PaymentStrategy getPayment(){
        return payment;
    }
    public void pay(){
        System.out.println("Payment transaction completed successfully");
        System.out.println("Thank u for choosing us! ");
    }


    @Override
    public void update() {
        System.out.println("The Lucky Hour!! - Half of the cost!"); }
}
