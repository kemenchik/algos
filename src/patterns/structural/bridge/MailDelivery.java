package patterns.structural.bridge;

public class MailDelivery implements DeliveryMethod {

    private Notification notification;

    public MailDelivery(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void deliverNotification() {
        loginToAppMail();
        sendMail(notification);

    }

    private void loginToAppMail(){}
    private void sendMail(Notification notification){
        System.out.print("Mail: ");
        notification.getInformation();
    }

}
