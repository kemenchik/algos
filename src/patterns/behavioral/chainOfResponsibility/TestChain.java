package patterns.behavioral.chainOfResponsibility;

public class TestChain {

    public static void main(String[] args) {
        Tariff tariffDef = new SimpleTariff();
        Tariff tariffImp = new ImprovedTariff();
        Tariff tariffGold = new GoldTariff();
        tariffDef.setNext(tariffImp);
        tariffImp.setNext(tariffGold);
        ChainOfTariffs chain = new ChainOfTariffs(tariffDef);
        chain.findTariff("CustomStickers");
    }
}
