package patterns.structural.facade;

public interface DbConnection {

    void addEvent(Event event);
    void addNotification(Notification notification);

}
