package patterns.behavioral.visitor;

public interface Visitor {

    void reportVisit(ReportDocument report);
    void agreementVisit(AgreementDocument agreement);
    void receiptVisit(ReceiptDocument receipt);

}
