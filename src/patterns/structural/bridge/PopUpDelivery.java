package patterns.structural.bridge;

public class PopUpDelivery implements DeliveryMethod {

    private Notification notification;

    public PopUpDelivery(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void deliverNotification() {
        connectsToDeviceApi();
        sendNotify(notification);
    }

    private void connectsToDeviceApi() {
    }
    private void sendNotify(Notification notification) {
        System.out.print("Pop-up: ");
        notification.getInformation();
    }

}
