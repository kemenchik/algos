package patterns.behavioral.visitor;

public class AgreementDocument implements Document {

    private String name;
    private int number;
    private String head;

    public AgreementDocument(int number, String head) {
        this.name = "Agreement№";
        this.number = number;
        this.head = head;
    }

    public String getTitle() {
        return name+number;
    }


    public String getHead() {
        return head;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.agreementVisit(this);
    }
}
