package patterns.behavioral.mediator;

import java.util.List;

public class MessageHistory {

    private List<String> messages;
    private Mediator mediator;

    public MessageHistory(List<String> messages, Mediator mediator) {
        this.messages = messages;
        this.mediator = mediator;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void getVisible(User user, Chat chat) {
        mediator.see(user, chat, this);
    }
}
