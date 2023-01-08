package patterns.creational.abstractFactory;

public class OfflineContractFactory implements ContractFactory {

    @Override
    public Agreement createAgreement() {
        return new OfflineAgreement();
    }

    @Override
    public Payment createPayment() {
        return new OfflinePayment();
    }
}
