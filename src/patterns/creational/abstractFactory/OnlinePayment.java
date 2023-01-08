package patterns.creational.abstractFactory;

public class OnlinePayment implements Payment{
    @Override
    public void makeReceipt() {
        System.out.println("Issue a check for online payment");
    }
}
