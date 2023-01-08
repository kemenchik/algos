package patterns.structural.composite;

public class EventMember implements Member{
    private String name;
    private int points;

    public EventMember(String name) {
        this.name = name;
        this.points=0;
    }


    @Override
    public int getSeasonPoints() {
        System.out.println(name+" has "+points+" points.");
        return points;
    }

    @Override
    public void addPoints(int point) {
        this.points =points+point;
    }
}
