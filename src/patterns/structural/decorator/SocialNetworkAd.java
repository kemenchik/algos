package patterns.structural.decorator;

public class SocialNetworkAd implements EventAd{
    private EventAd ad;
    private static final String NAME = "Social Network ad";
    private static final double COEF = 1.6;
    private static final int PRICE = 1100;

    public SocialNetworkAd(EventAd ad){
        this.ad=ad;
    }

    @Override
    public int getStatistic() {
        return (int) (ad.getStatistic()*COEF);
    }

    @Override
    public String getHistoryAd() {
        return ad.getHistoryAd()+", "+NAME+": "+"+"+PRICE;
    }

    @Override
    public int getTariffCost() {
        return ad.getTariffCost()+PRICE;
    }
}