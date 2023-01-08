package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UserGroup implements Member {
    private List<Member> members;

    public UserGroup(List<Member> members) {
        this.members = members;
    }

    public UserGroup() {
        this.members = new ArrayList<>();
    }

    public UserGroup addMember(Member member) {
        members.add(member);
        return this;
    }

    public int getSeasonPoints() {
        int sumPoints = 0;
        for (Member member :
                members) {
            sumPoints += member.getSeasonPoints();
        }
        return sumPoints;
    }

    @Override
    public void addPoints(int point) {
        for (Member member :
                members) {
            member.addPoints(point);
        }
    }
}
