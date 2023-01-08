package patterns.creational.builder;
import java.util.Calendar;

public class BuilderEvent {
    String title;
    String creator;
    boolean secret;
    Calendar data;
    ThemeTag theme;
    String description;

    public BuilderEvent(String title, Calendar data) {
        this.title = title;
        this.data=data;
    }

    public BuilderEvent addCreator(String creator){
        this.creator=creator;
        return this;
    }

    public BuilderEvent makeSecret(){
        this.secret=true;
        return this;
    }

    public BuilderEvent addTheme(ThemeTag theme){
        this.theme=theme;
        return this;
    }

    public BuilderEvent addDescription(String description){
        this.description=description;
        return this;
    }

    public Event build(){
        return new Event(this);
    }


}
