package patterns.structural.decorator;

public class MailingAd implements EventAd{
    private EventAd ad;
    private static final String NAME = "Mailing";
    private static final double COEF = 1.5;
    private static final int PRICE = 900;

    public MailingAd(EventAd ad){
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
