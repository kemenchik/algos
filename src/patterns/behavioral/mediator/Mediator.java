package patterns.behavioral.mediator;

public class Mediator {

    public void see(User user, Chat chat, MessageHistory messages) {
        if (chat.findUser(user)) {
            System.out.println(messages.getMessages());
            return;
        }
        System.out.println("You aren't a member of the chat");
    }

    public void userJoin(User user, Chat chat) {
        chat.addMember(user);
    }

    public void userLeft(User user, Chat chat) {
        chat.deleteMember(user);
    }


}
