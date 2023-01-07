package patterns.behavioral.templateMethod;

public class H2DataBase extends DataBase {
    @Override
    protected void connectToDB() {
        System.out.println("Connect to h2");
    }

    @Override
    protected void createDataBase() {
        System.out.println("[H2]Create db");
    }

    @Override
    protected void createTable() {
        System.out.println("[H2] Create table ");
    }
}
