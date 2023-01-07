package patterns.creational.factoryMethod;

public class RegularUserFactory extends UserFactory {
    @Override
    User makeUser(String name, String password) {
        return new RegularUser(name, password);
    }
}
