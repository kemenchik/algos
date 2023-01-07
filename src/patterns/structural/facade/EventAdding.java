package patterns.structural.facade;

import java.util.Calendar;

public class EventAdding {

    public void addEvent(String title, Calendar data,String place, String platform) {
        if (title != null && data != null && place != null && platform != null) {
            Event event = new EventImpl(title, data, place);
            Notification notification = new NotificationImpl(event, platform);
            DbConnection dbConnection = new DbConnectionImpl();
            dbConnection.addEvent(event);
            dbConnection.addNotification(notification);
        }
    }

}
