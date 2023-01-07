package patterns.behavioral.memento;

public class User {
    private String login;

    public User(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User " + login;
    }

    public String getLogin() {
        return login;
    }
}
