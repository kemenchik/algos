package patterns.behavioral.state;

public class Event {

    private State state;
    private String name;
    private String place;
    private int views;

    public Event(String name, String place) {
        this.state = new CreateState();
        this.name = name;
        this.place = place;
        printState();
    }

    public Event timePassed() {
        if (!(state instanceof EventPassed)) {
            views = views + (int) (Math.random() * (100 + 1));
            System.out.println("views: " + views);
            if (state instanceof EventOccursState) {
                state = new EventPassed();
                printState();
                return this;
            }
            if (state instanceof CreateState) {
                if (views > 70) {
                    this.state = new TopState();
                    printState();
                }
            }
            if (views % 3 == 0) {
                this.state = new EventOccursState();
                printState();
            }
        }
        return this;
    }

    private void printState() {
        state.execute();
    }

    public State getState() {
        return state;
    }
}
