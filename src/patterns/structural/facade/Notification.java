package patterns.structural.facade;

public abstract class Notification {

    private Event event;
    private String platform;

    public Notification(Event event, String platform) {
        this.event=event;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Notification about " + event +
                " event at platform='" + platform;
    }
}
