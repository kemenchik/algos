package patterns.behavioral.state;

public class EventPassed implements State{

    @Override
    public void execute() {
        deleteFromAnywhere();
    }

    private void deleteFromAnywhere() {
        System.out.println("The event has passed and has been deleted");
    }

}
