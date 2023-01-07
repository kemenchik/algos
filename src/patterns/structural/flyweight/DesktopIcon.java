package patterns.structural.flyweight;

public class DesktopIcon implements Icon {

    private ColorType color;
    private int size;

    public DesktopIcon(ColorType color) {
        System.out.println("New icon: color - " + color );
        this.color = color;
    }

    @Override
    public Icon setSize(int side) {
        this.size=side;
        return this;
    }

    @Override
    public String displayed() {
        return "DesktopIcon: " +
                "color=" + color +
                ", size=" + size;
    }
}
