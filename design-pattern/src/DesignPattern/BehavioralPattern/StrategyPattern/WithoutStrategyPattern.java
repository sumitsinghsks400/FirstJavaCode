package DesignPattern.BehavioralPattern.StrategyPattern;

class PaymentService {
     public  void processPayment(String paymentMethod) {
         if(paymentMethod.equals("CreditCard")) {
             System.out.println("Making Payment Vai Credit Card");
         } else if(paymentMethod.equals("DebitCard")) {
             System.out.println("Making payment vai Debit Card");
         }else {
             System.out.println("Unsuported payment");
         }
     }
 }
public class WithoutStrategyPattern {
    public static void main(String[] args) {


        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CreditCard");
    }
}
