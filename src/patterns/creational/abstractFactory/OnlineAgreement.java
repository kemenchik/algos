package patterns.creational.abstractFactory;

public class OnlineAgreement implements Agreement{
    @Override
    public Agreement prepareDocuments() {
        System.out.println("Prepare documents and send them");
        return new OnlineAgreement();
    }
}
