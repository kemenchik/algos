package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class ChatMemento {

    private String name;
    private List<User> users;
    private List<String> messages;

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(List<User> users) {
        this.users = new ArrayList<>(users);
    }

    public void setMessages(List<String> messages) {
        this.messages = new ArrayList<>(messages);
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "ChatMemento \""+getName()+"\": \nUsers "+getUsers()+";\nMessages "+getMessages()+"\n";
    }
}
