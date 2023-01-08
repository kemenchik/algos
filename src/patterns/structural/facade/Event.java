package patterns.structural.facade;

import java.util.Calendar;

public abstract class Event {

    private String title;
    private Calendar data;
    private String place;

    public Event(String title, Calendar data,  String place){
        this.title=title;
        this.data=data;
        this.place=place;
    }

    @Override
    public String toString() {
        return "Event " +
                "\"" + title + '\"' +
                " at " + data.getTime() +
                " in " + place ;
    }
}
