package patterns.listener;

public class TestClass {

    public static void main(String[] args) {
        EventManager manager = new EventManager("open", "close", "edit", "send");
        EmailListener listener = new EmailListener(manager);
        EventPublisher publisher = new EventPublisher(manager);

        publisher.sendEmail();
    }
}
