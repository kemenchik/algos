package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Chat {

    private String name;
    private List<User> users;
    private List<String> messages;

    public Chat(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void addUser(User... user) {
        for (User person : user) {
            users.add(person);
        }
    }

    public void sendMessage(String... text) {
        for (String message: text) {
            messages.add(message);
        }
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

    public ChatMemento setMemento() {
        ChatMemento memento = new ChatMemento();
        memento.setName(name);
        memento.setMessages(messages);
        memento.setUsers(users);
        return memento;
    }

    public void getMemento(ChatMemento memento) {
        this.name =memento.getName();
        this.messages = memento.getMessages();
        this.users = memento.getUsers();
    }

    @Override
    public String toString() {
        return "Chat \""+getName()+"\": \nUsers "+getUsers()+";\nMessages "+getMessages()+"\n";
    }
}

