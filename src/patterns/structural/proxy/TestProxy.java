package patterns.structural.proxy;

public class TestProxy {

    public static void main(String[] args) {
        Document decreeDoc = new PaperDocumentProxy
                (new PaperDocument("Horolskiy N.V", "Horolskiy N.V.",DocTypes.DECREE));
        Document leaveDoc = new PaperDocumentProxy
                (new PaperDocument("Mirkov D.T.", "Gorohov M.D.", DocTypes.LEAVE));
        Document actDoc = new PaperDocumentProxy
                (new PaperDocument("Lozov A.A.", "Porohov D.D.", DocTypes.ACT));

        decreeDoc.assign();
        leaveDoc.assign();
        actDoc.assign();
    }
}
