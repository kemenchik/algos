package patterns.behavioral.visitor;

public class JsonVisitor implements Visitor{
    @Override
    public void reportVisit(ReportDocument report) {
        System.out.println(report.getTitle()+" in json");
    }

    @Override
    public void agreementVisit(AgreementDocument agreement) {
        System.out.println(agreement.getTitle()+" in json");
    }

    @Override
    public void receiptVisit(ReceiptDocument receipt) {
        System.out.println(receipt.getTitle()+" in json");

    }
}
