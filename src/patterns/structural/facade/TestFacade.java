package patterns.structural.facade;

import java.util.GregorianCalendar;

public class TestFacade {

    public static void main(String[] args) {
        EventAdding eventAdding = new EventAdding();
        eventAdding.addEvent("New Year",new GregorianCalendar(2022,12,31),"Moscow","telegram");

    }

}
