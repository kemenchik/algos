package patterns.behavioral.state;

public class TopState implements State{

    @Override
    public void execute() {
        displayInTop();
    }

    private void displayInTop() {
        System.out.println("Event displayed in top");
    }

}
