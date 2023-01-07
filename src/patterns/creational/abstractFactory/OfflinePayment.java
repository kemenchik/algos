package patterns.creational.abstractFactory;

public class OfflinePayment implements Payment{
        @Override
        public Payment makeReceipt() {
            System.out.println("Issue a check for offline payment");
            return new OfflinePayment();
        }
    }
