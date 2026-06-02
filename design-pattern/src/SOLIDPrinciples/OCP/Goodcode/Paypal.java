package SOLIDPrinciples.OCP.Goodcode;

public class Paypal implements paymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making payment vai paypal");
    }
}
