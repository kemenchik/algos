package patterns.behavioral.state;

public class CreateState implements State {
    @Override
    public void execute() {
        displayOnMap();
        createNotification();
    }

    private void displayOnMap() {
        System.out.println("Event begins displayed on map");
    }

    private void createNotification() {
        System.out.println("Event notification created");
    }

}
