package patterns.behavioral.visitor;

public class XmlVisitor implements Visitor{
    @Override
    public void reportVisit(ReportDocument report) {
        System.out.println(report.getTitle()+" in xml");
    }

    @Override
    public void agreementVisit(AgreementDocument agreement) {
        System.out.println(agreement.getTitle()+" in xml");
    }

    @Override
    public void receiptVisit(ReceiptDocument receipt) {
        System.out.println(receipt.getTitle()+" in xml");
    }
}
