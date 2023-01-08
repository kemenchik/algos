package patterns.structural.composite;

public class TestComposite {

    public static void main(String[] args) {
        UserGroup newEvent = new UserGroup();
        EventMember john = new EventMember("John");
        john.addPoints(10);
        EventMember kate = new EventMember("Kate");
        kate.addPoints(8);
        EventMember pam = new EventMember("Pam");
        pam.addPoints(7);
        EventMember tommy = new EventMember("Tommy");
        tommy.addPoints(2);
        EventMember ann = new EventMember("Ann");
        ann.addPoints(12);
        UserGroup groupPamAndTommy = new UserGroup();
        groupPamAndTommy.addMember(tommy).addMember(pam);
        UserGroup bigGroup = new UserGroup();
        bigGroup.addMember(ann).addMember(groupPamAndTommy).addPoints(3);

        newEvent.addMember(john).addMember(kate).addMember(bigGroup);
        System.out.println(newEvent.getSeasonPoints());

    }
}
