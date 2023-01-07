package patterns.behavioral.templateMethod;

public class MySQLDataBase extends DataBase {
    @Override
    protected void connectToDB() {
        System.out.println("Connect to MySQL");
    }

    @Override
    protected void createDataBase() {
        System.out.println("[MySQL] Create db");
    }

    @Override
    protected void createTable() {
        System.out.println("[MySQL] Create table");
    }
}
