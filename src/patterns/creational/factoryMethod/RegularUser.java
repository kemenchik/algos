package patterns.creational.factoryMethod;

public class RegularUser implements User {
    String name;
    String password;

    public RegularUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void useApp() {
        System.out.println(name+ " scrolling news");
    }
}
