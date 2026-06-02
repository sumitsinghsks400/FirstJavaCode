package SOLIDPrinciples.OCP.Goodcode;

public class DebitCard implements paymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment vai Debit card");
    }
}
