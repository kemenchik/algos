package patterns.creational.abstractFactory;

public class Contract {
    private Agreement agreement;
    private Payment payment;

    public Contract (ContractFactory factory){
        agreement= factory.createAgreement();
        payment = factory.createPayment();
    }

    public Agreement getAgreement() {
        agreement.prepareDocuments();
        return agreement;
    }

    public Payment getPayment() {
        payment.makeReceipt();
        return payment;
    }
}
