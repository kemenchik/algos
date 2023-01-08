package patterns.behavioral.visitor;

public interface Document {

    void accept(Visitor visitor);

}
