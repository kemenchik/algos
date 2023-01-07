package patterns.structural.decorator;

public class GetToTopAd implements EventAd{
    private EventAd ad;
    private static final String NAME = "GetToTop";
    private static final double COEF = 1.3;
    private static final int PRICE = 700;

    public GetToTopAd(EventAd ad){
        this.ad=ad;
    }

    @Override
    public int getStatistic() {
        return (int) (ad.getStatistic()*COEF);
    }

    @Override
    public String getHistoryAd() {
        return ad.getHistoryAd()+", "+NAME;
    }

    @Override
    public int getTariffCost() {
        return ad.getTariffCost()+PRICE;
    }
}
