package SOLIDPrinciples.OCP.Goodcode;

public class CreditCard implements  paymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making payment vai credit card" + amount);
    }
}
