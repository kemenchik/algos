package patterns.structural.facade;


import java.util.Calendar;

public class EventImpl extends Event{

    EventImpl(String title, Calendar data, String place) {
        super(title, data, place);
    }
}
