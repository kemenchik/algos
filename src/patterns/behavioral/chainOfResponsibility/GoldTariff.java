package patterns.behavioral.chainOfResponsibility;

import java.util.List;

public class GoldTariff extends Tariff {

    public static final String NAME = "Gold Tariff";
    private static final int PRICE = 800;
    private static final List<String> additionalBonuses = List.of("ShowEventMembers","CustomStickers","MoreThen15OwnEvents") ;


    public GoldTariff() {
        super(NAME, PRICE, additionalBonuses);
    }
}
