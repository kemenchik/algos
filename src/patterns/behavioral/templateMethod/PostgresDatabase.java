package patterns.behavioral.templateMethod;

public class PostgresDatabase extends DataBase {
    @Override
    protected void connectToDB() {
        System.out.println("Connect to PostgreSQL");
    }

    @Override
    protected void createDataBase() {
        System.out.println("[PostgreSQL] Create db");
    }

    @Override
    protected void createTable() {
        System.out.println("[PostgreSQL] Create table");
    }
}
