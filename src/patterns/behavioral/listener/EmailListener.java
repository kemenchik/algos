package patterns.behavioral.listener;

public class EmailListener implements EventListener {


    public EmailListener(EventManager manager) {
        manager.subscribe("send", this);
    }

    @Override
    public void inform() {
        System.out.println("Loooool, it was email");
    }
}
