package patterns.creational.abstractFactory;

public interface ContractFactory {
    Agreement createAgreement();

    Payment createPayment();
}
