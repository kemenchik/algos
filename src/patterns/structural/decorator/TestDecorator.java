package patterns.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        EventAd defaultTariff = new DefaultTariff(100);
        EventAd getToTopTariff = new GetToTopAd(defaultTariff);
        EventAd mailingTariff = new MailingAd(getToTopTariff);
        EventAd socialNetworkTariff = new SocialNetworkAd(mailingTariff);

        System.out.println("Pay "+socialNetworkTariff.getTariffCost()+", your stat: "+ socialNetworkTariff.getStatistic()+
                "\n History: "+socialNetworkTariff.getHistoryAd());

    }
}
