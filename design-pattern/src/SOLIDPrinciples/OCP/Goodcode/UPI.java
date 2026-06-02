package SOLIDPrinciples.OCP.Goodcode;

public class UPI implements  paymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("make payment vai upi " + amount);

    }
}
