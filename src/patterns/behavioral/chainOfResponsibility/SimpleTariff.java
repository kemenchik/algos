package patterns.behavioral.chainOfResponsibility;

import java.util.List;

public class SimpleTariff extends Tariff {
    public static final String NAME = "Simple Tariff";
    private static final int PRICE = 400;
    private static final List<String> additionalBonuses = List.of("VideoMessage", "AudioMessage", "OwnTheme") ;

    public SimpleTariff() {
        super(NAME,PRICE,additionalBonuses);
    }
}
