package patterns.behavioral.chainOfResponsibility;

public class ChainOfTariffs {

    private Tariff head;

    public ChainOfTariffs(Tariff head) {
        this.head = head;
    }

    public boolean findTariff(String bonus) {
        if (head != null) {
            do {
                if (head.containsBonus(bonus)) {
                    return true;
                }
                head = head.getNext();
            } while (head!=null);
            System.out.println("No such bonus");
        }
        return false;
    }
}
