package patterns.structural.decorator;

public class DefaultTariff implements EventAd {
    private int reach;
    private static final String NAME = "DefaultTariff";
    private int price;

    public DefaultTariff(int reach) {
        this.reach = reach;
    }


    @Override
    public int getStatistic() {
        return reach;
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
