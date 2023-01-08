package patterns.creational.builder;

import java.util.Calendar;

public class Event {


    String title;
    Calendar data;
    String creator;
    boolean secret;
    ThemeTag theme;
    String description;

    public Event(BuilderEvent builderEvent) {
        this.title = builderEvent.title;
        this.data=builderEvent.data;
        this.creator=builderEvent.creator;
        this.secret= builderEvent.secret;
        this.theme=builderEvent.theme;
        this.description= builderEvent.description;
    }
    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", data=" + data.getTime() +
                ", creator='" + creator + '\'' +
                ", secret=" + secret +
                ", theme=" + theme +
                ", description='" + description + '\'' +
                '}';
    }
}
