package patterns.behavioral.visitor;

public class ReceiptDocument implements Document {

    private String name;

    private int number;
    private int sum;

    public ReceiptDocument(int number, int sum) {
        this.name = "Receipt№";
        this.number = number;
        this.sum = sum;
    }

    public String getTitle() {
        return name+number;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.receiptVisit(this);
    }
}
