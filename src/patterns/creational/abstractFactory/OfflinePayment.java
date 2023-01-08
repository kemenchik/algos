package patterns.creational.abstractFactory;

public class OfflinePayment implements Payment{
        @Override
        public void makeReceipt() {
            System.out.println("Issue a check for offline payment");
        }
    }
