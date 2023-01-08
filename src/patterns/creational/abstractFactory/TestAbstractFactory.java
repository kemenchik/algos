package patterns.creational.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {

      Contract onlineContract = new Contract(new OnlineContractFactory());
      onlineContract.getAgreement();
      onlineContract.getPayment();

      Contract offlineContract = new Contract(new OfflineContractFactory());
      offlineContract.getAgreement();
      offlineContract.getPayment();
    }
}
