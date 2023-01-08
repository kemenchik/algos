package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class TestMemento {

    public static void main(String[] args) {
        List<ChatMemento> history = new ArrayList<>();
        Chat chat = new Chat("Party");
        history.add(chat.setMemento());

        chat.addUser(new User("Kate"), new User("Rob"), new User("Jane"));
        chat.sendMessage("hi", "hello");
        System.out.println(chat);
        history.add(chat.setMemento());

        chat.addUser(new User("John"), new User("Carl"));
        chat.sendMessage("aaa", "bbb");
        System.out.println(chat);
        history.add(chat.setMemento());

        chat.addUser(new User("Ivan"), new User("Ann"));
        chat.sendMessage("bye", "bye!");
        System.out.println(chat);
        history.add(chat.setMemento());

        for (ChatMemento memento : history) {
            System.out.println(memento);
        }
    }

}
