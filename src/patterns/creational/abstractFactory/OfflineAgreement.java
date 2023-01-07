package patterns.creational.abstractFactory;

public class OfflineAgreement implements Agreement{
    @Override
    public Agreement prepareDocuments() {
        System.out.println("Prepare Documents and print them");
        return new OnlineAgreement();
    }
}
