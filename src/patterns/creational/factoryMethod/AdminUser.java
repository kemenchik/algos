package patterns.creational.factoryMethod;

public class AdminUser implements User{
    String name;
    String password;

    public AdminUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void useApp() {
        System.out.println(name+" moderating the news");
    }
}
