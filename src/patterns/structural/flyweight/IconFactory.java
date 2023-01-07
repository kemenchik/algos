package patterns.structural.flyweight;

import java.util.HashMap;

public class IconFactory {
    private HashMap<ColorType, Icon> icons = new HashMap<>();

    public Icon getIcon(ColorType type) {
        Icon icon = icons.get(type);
        if (icon == null) {
            switch (type){
                case BLUE: {
                    icon = new DesktopIcon(ColorType.BLUE);
                    icons.put(type, icon);
                    break;
                }
                case BLACK: {
                    icon = new DesktopIcon(ColorType.BLACK);
                    icons.put(type, icon);
                    break;
                }
                case WHITE: {
                    icon = new DesktopIcon(ColorType.WHITE);
                    icons.put(type, icon);
                    break;
                }
                case RED: {
                    icon = new DesktopIcon(ColorType.RED);
                    icons.put(type, icon);
                    break;
                }
                default:
                    System.out.println("No such theme");
                    break;
            }
        }
        return icon;
    }


}
