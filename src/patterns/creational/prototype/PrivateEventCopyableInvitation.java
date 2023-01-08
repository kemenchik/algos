package patterns.creational.prototype;

import java.util.Calendar;

public class PrivateEventCopyableInvitation implements CopyableInvitation {

    private String party;
    private Calendar day;

    public PrivateEventCopyableInvitation( String party, Calendar day) {
        this.party = party;
        this.day = day;
    }

    @Override
    public CopyableInvitation copy() {
        return new PrivateEventCopyableInvitation(this.party, (Calendar) this.day.clone());
    }

    @Override
    public String toString() {
        return "Invitation " +
                "\n  party:" + party +
                "\n  day:" + day.getTime();
    }

}
