package patterns.behavioral.state;

public class EventOccursState implements State{

    @Override
    public void execute() {
        goOn();
        showInList();
    }

    private void goOn() {
        System.out.println("Event is going on");
    }

    private void showInList() {
        System.out.println("Show in the list of ongoing events");
    }

}
