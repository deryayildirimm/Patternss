package OnlineCoffee;

public interface ISubject {
    void subscribe(Customer sub);

    void unSubscribe(Customer sub);

    void notifySubscriber();


}
