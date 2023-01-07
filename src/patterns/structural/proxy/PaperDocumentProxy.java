package patterns.structural.proxy;

public class PaperDocumentProxy implements Document {
    private PaperDocument paperDocument;

    public PaperDocumentProxy(PaperDocument document) {
        this.paperDocument = document;
    }

    @Override
    public Document assign() {
        if (!paperDocument.isAssign()) {
            if (paperDocument.getFrom() == paperDocument.getTo()) {
                throw new IllegalArgumentException("Uncorrected information");
            }
            if (paperDocument.getType() == DocTypes.LEAVE && paperDocument.getTo().contains("Gorohov")) {
                System.out.println("Document is out of date");
                throw new IllegalArgumentException("Old document");
            }
           return paperDocument.assign();
        }
        return paperDocument;
    }
}
