package patterns.behavioral.visitor;

import java.util.List;

public class TestVisitor {

    public static void main(String[] args) {
        List<Document> papers = List.of(new ReportDocument(453, "work"),
                new ReceiptDocument(257, 70000), new AgreementDocument(920, "Lokov A.A."));

        Visitor jsonVisitor = new JsonVisitor();
        Visitor xmlVisitor = new XmlVisitor();

        for (Document paper:papers) {
            paper.accept(jsonVisitor);
            paper.accept(xmlVisitor);
        }
    }
}
