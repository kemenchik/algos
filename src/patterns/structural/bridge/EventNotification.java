package patterns.structural.bridge;

public class EventNotification implements Notification{

    @Override
    public void getInformation() {
        System.out.println("You have been invited to an event");
    }
}
