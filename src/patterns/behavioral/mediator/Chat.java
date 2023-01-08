package patterns.behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

public class Chat {
    List<User> users = new LinkedList<>();

    public void addMember(User... member) {
        for (User person : member) {
            users.add(person);
        }
    }

    public boolean deleteMember(User member) {
        return users.remove(member);
    }

    public boolean findUser(User user) {
        return users.contains(user);
    }

}
