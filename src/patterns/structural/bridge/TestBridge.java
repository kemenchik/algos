package patterns.structural.bridge;


import java.util.ArrayList;
import java.util.List;

public class TestBridge {

    public static void main(String[] args) {
        Notification notification1 = new FriendNotification();
        Notification notification2 = new EventNotification();
        Notification notification3 = new MessageNotification();

        List<DeliveryMethod> notificationDelivers = new ArrayList<>();
        notificationDelivers.add(new MailDelivery(notification1));
        notificationDelivers.add(new MailDelivery(notification2));
        notificationDelivers.add(new MailDelivery(notification3));
        notificationDelivers.add(new PopUpDelivery(notification1));
        notificationDelivers.add(new PopUpDelivery(notification2));
        notificationDelivers.add(new PopUpDelivery(notification3));

        for (DeliveryMethod notificationDeliver:
                notificationDelivers) {
            notificationDeliver.deliverNotification();

        }
    }


}
