package patterns.creational.factoryMethod;

public class TestFactoryMethod {

    public static void main(String[] args) {
        UserFactory userFactory = new RegularUserFactory();
        User user = userFactory.makeUser("John","1234");
        user.useApp();

        userFactory = new AdminUserFactory();
        user = userFactory.makeUser("Carl","2222");
        user.useApp();

    }

}
