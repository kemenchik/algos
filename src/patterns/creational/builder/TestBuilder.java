package patterns.creational.builder;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestBuilder {
    public static void main(String[] args) {
        Event meet = (new BuilderEvent("meet",new GregorianCalendar(2023, Calendar.FEBRUARY,21)))
                .addCreator("Jane Doe")
                .makeSecret()
                .addTheme(ThemeTag.COFFEE)
                .addDescription("Coffee time")
                .build();
        System.out.println(meet);
           }
}
