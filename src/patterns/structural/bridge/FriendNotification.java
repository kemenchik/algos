package patterns.structural.bridge;

public class FriendNotification implements Notification{
    @Override
    public void getInformation() {
        System.out.println("You have one new friend");
    }
}
