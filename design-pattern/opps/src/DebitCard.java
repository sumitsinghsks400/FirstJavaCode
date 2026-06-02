public class DebitCard extends  Card{
    public DebitCard(String userName, String cardNo) {
        super(userName, cardNo);
    }

    @Override
    public void pay() {
        System.out.println("Making payment void credit Card");

    }
}
