package patterns.structural.bridge;

public class MessageNotification implements Notification{

    @Override
    public void getInformation() {
        System.out.println("You receive new message!");

    }
}
