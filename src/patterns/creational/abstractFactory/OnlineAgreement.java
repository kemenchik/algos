package patterns.creational.abstractFactory;

public class OnlineAgreement implements Agreement{
    @Override
    public void prepareDocuments() {
        System.out.println("Prepare documents and send them");
    }
}
