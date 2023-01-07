package patterns.creational.factoryMethod;

public class AdminUserFactory extends UserFactory {
    @Override
    User makeUser(String name, String password) {
        return new AdminUser(name, password);
    }
}
