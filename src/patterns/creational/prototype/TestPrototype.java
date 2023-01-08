package patterns.creational.prototype;

import java.util.GregorianCalendar;

public class TestPrototype {

    public static void main(String[] args) {
                CopyableInvitation originInvitation = new PrivateEventCopyableInvitation("HB",new GregorianCalendar(2023,01,01));
                CopyableInvitation copy1 = originInvitation.copy();
                CopyableInvitation copy2 = originInvitation.copy();
                CopyableInvitation copy3 = originInvitation.copy();
        System.out.println(originInvitation+"\n"+copy1+"\n"+copy2+"\n"+copy3);
    }

}
