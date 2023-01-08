package patterns.structural.facade;

public class DbConnectionImpl implements DbConnection{

    DbConnectionImpl(){
        System.out.println("connection established");
    }

    @Override
    public void addEvent(Event event) {
        System.out.println(event+"insert into table");
    }

    @Override
    public void addNotification(Notification notification) {
        System.out.println(notification+"insert into table");
    }
}
