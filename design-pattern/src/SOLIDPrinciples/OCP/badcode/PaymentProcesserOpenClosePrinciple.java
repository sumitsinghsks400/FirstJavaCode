package SOLIDPrinciples.OCP.badcode;

public class PaymentProcesserOpenClosePrinciple {
    public  void processPayment(String paymentMethod,double amount) throws IllegalAccessException {
        if(paymentMethod.equals("CreditCard")) {
            System.out.println("making payment vai Credit card :" + amount);
        }else   if(paymentMethod.equals("DebitCard")) {
            System.out.println("making payment vai Debit card :" + amount);
        } else   if(paymentMethod.equals("paypal")) {
            System.out.println("making payment vai payPal :" + amount);
        }else {
            throw  new IllegalAccessException("unsupported payment methode " + paymentMethod);
        }
    }
}
