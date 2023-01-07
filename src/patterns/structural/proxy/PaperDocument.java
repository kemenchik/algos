package patterns.structural.proxy;


public class PaperDocument implements Document{
private String from;
private String to;
private DocTypes type;
Boolean assigned;

    public PaperDocument(String from, String to, DocTypes type) {
        this.from = from;
        this.to = to;
        this.type = type;
        this.assigned = false;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public DocTypes getType() {
        return type;
    }

    public Boolean isAssign() {
        return assigned;
    }

    @Override
    public Document assign() {
        this.assigned=true;
        System.out.println(type+" the document is signed");
        return this;
    }
}
