package patterns.structural.decorator;

public class DefaultTariff implements EventAd {
    private int stat;
    private static final String NAME = "DefaultTariff";
    private int price;

    public DefaultTariff(int stat) {
        this.stat = stat;
    }


    @Override
    public int getStatistic() {
        return stat;
    }

    @Override
    public String getHistoryAd() {
        return "Yot package consist: " + NAME;
    }

    @Override
    public int getTariffCost() {
        return price;
    }
}
