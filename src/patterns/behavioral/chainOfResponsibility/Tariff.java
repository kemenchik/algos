package patterns.behavioral.chainOfResponsibility;

import java.util.List;

public abstract class Tariff {

    private String name;
    private int price;
    private List<String> additionalBonuses;
    private Tariff next;

    public Tariff(String name, int price, List<String> additionalBonuses) {
        this.name=name;
        this.price = price;
        this.additionalBonuses = additionalBonuses;
    }

    public void setNext(Tariff next) {
        this.next = next;
    }

    public Tariff getNext() {
        return next;
    }

    public int getPrice() {
        return price;
    }

    public boolean containsBonus(String bonus) {
        for (String bonusFromList : additionalBonuses) {
            if (bonusFromList.equals(bonus)) {
                System.out.println("Tariff \""+name+"\" contains deserving bonus "+bonus);
                return true;
            }
        }
        return false;
    }

}
