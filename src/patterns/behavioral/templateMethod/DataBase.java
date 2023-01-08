package patterns.behavioral.templateMethod;

public abstract class DataBase {

    protected abstract void connectToDB();

    protected abstract void createDataBase();

    protected abstract void createTable();

    final void databasePreparation() {
        connectToDB();
        createDataBase();
        createTable();
    }

}
