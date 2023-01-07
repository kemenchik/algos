package patterns.behavioral.mediator;

import java.util.List;

public class TestMediator {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Chat party = new Chat();
        User john = new User("John", mediator);
        User doe = new User("Doe", mediator);
        User kate = new User("Kate", mediator);
        User nate = new User("Nate",mediator);
        party.addMember(john,doe,kate);
        MessageHistory messages = new MessageHistory(List.of("a", "b", "c", "d"), mediator);

        messages.getVisible(nate,party);
        messages.getVisible(kate,party);

    }

}
