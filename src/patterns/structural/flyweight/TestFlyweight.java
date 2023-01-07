package patterns.structural.flyweight;

import java.util.List;

public class TestFlyweight {

    public static void main(String[] args) {
        IconFactory factory = new IconFactory();
        List<Icon> laptopScreen = List.of(
                factory.getIcon(ColorType.WHITE).setSize(20),
                factory.getIcon(ColorType.RED).setSize(30),
                factory.getIcon(ColorType.WHITE).setSize(30),
                factory.getIcon(ColorType.BLACK).setSize(40),
                factory.getIcon(ColorType.BLUE).setSize(10),
                factory.getIcon(ColorType.WHITE).setSize(20),
                factory.getIcon(ColorType.BLUE).setSize(30)
        );
        for (Icon icon:laptopScreen) {
            System.out.println(icon.displayed());
        }

    }
}
