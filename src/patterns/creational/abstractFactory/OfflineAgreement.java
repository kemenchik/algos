package patterns.creational.abstractFactory;

public class OfflineAgreement implements Agreement {
    @Override
    public void prepareDocuments() {
        System.out.println("Prepare Documents and print them");
    }

}
