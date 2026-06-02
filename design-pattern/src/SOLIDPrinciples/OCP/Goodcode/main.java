package SOLIDPrinciples.OCP.Goodcode;

public class main {
    public static void main(String[] args) throws IllegalAccessException {
        PaymentProcesserOpenClosePrinciple process= new PaymentProcesserOpenClosePrinciple();
        paymentMethod creditCard = new CreditCard();
        process.processPayment(creditCard,100);
        paymentMethod upi =   new UPI();
        process.processPayment(upi, 29);
    }
}
