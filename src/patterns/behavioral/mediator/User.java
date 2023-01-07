package patterns.behavioral.mediator;

public class User {

    private final String login;

    private Mediator mediator;

    public User(String login, Mediator mediator) {
        this.login = login;
        this.mediator = mediator;
    }

    public String getLogin() {
        return login;
    }

    public void joinChat(Chat chat) {
        mediator.userJoin(this, chat);
    }

    public void leftChat(Chat chat) {
        mediator.userLeft(this, chat);
    }
}
