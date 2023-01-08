package patterns.behavioral.state;

public class TestState {

    public static void main(String[] args) {
        Event event = new Event("Party", "Moscow");
        while (!(event.getState() instanceof EventPassed)) {
            event.timePassed();
        }
    }

}
