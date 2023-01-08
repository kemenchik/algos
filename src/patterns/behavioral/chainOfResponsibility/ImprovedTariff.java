package patterns.behavioral.chainOfResponsibility;

import java.util.List;

public class ImprovedTariff extends Tariff{

    public static final String NAME = "Improved Tariff";
    private static final int PRICE = 1500;
    private static final List<String> additionalBonuses = List.of("HideActivity","HideFriends","CustomTag") ;


    public ImprovedTariff() {
        super(NAME, PRICE, additionalBonuses);
    }
}
