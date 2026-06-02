package SOLIDPrinciples.OCP.Goodcode;

public class PaymentProcesserOpenClosePrinciple {
    public  void processPayment(paymentMethod paymentMethod,double amount) throws IllegalAccessException {
        paymentMethod.pay(amount);
    }
}
