package patterns.behavioral.visitor;

public class ReportDocument implements Document {

    private String name;

    private int number;

    private String about;

    public ReportDocument( int number, String about) {
        this.name = "Report№";
        this.number = number;
        this.about = about;
    }

    public String getTitle() {
        return name+number;
    }


    public String getAbout() {
        return about;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.reportVisit(this);
    }
}
