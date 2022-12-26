package patterns.listener;

public class EventPublisher {
    EventManager manager;

    public EventPublisher(EventManager manager) {
        this.manager = manager;
    }

    public void sendEmail() {
        System.out.println("Email sent");
        manager.notifyListeners("send");
    }
}
