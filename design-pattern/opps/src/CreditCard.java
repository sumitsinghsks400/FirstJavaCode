public class CreditCard  extends  Card{
    public CreditCard(String userName, String cardNo) {
        super(userName, cardNo);
    }

    @Override
    public void pay() {
        System.out.println("Making payment void Debit Card");
    }
}
