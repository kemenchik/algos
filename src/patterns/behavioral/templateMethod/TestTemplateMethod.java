package patterns.behavioral.templateMethod;

public class TestTemplateMethod {
    public static void main(String[] args) {
        DataBase dataBase = new H2DataBase();
        dataBase.databasePreparation();
        dataBase = new MySQLDataBase();
        dataBase.databasePreparation();
        dataBase = new PostgresDatabase();
        dataBase.databasePreparation();
    }
}
