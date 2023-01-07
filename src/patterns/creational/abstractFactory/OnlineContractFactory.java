package patterns.creational.abstractFactory;


public class OnlineContractFactory implements ContractFactory {

    @Override
    public Agreement createAgreement() {
        return new OnlineAgreement();
    }

    @Override
    public Payment createPayment() {
        return new OnlinePayment();
    }
}