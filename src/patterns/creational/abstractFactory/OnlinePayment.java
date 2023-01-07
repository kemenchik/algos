package patterns.creational.abstractFactory;

public class OnlinePayment implements Payment{
    @Override
    public Payment makeReceipt() {
        System.out.println("Issue a check for online payment");
        return new OnlinePayment();
    }
}
