package DesignPattern.BehavioralPattern.StrategyPattern;

  interface  PaymentStrategy {


    void ProceePayment();
}
class PaymentService2 {
      private  PaymentStrategy paymentStrategy;
      public void  setPaymentStrategy(PaymentStrategy paymentStrategy) {
          this.paymentStrategy=paymentStrategy;
      }

      public void pay() {
          paymentStrategy.ProceePayment();
      }
}
 class CreditCard implements PaymentStrategy {


     @Override
     public void ProceePayment() {
         System.out.println("Making payment via Credit Card");

     }
 }

class DreditCard implements PaymentStrategy {


    @Override
    public void ProceePayment() {
        System.out.println("Making payment via Debit Card");

    }
}
public class StrategyPattern {

    public static void main(String[] args) {
        PaymentService2  paymentService2 = new PaymentService2();
        CreditCard creditCard = new CreditCard();
        DreditCard dreditCard= new DreditCard();
        paymentService2.setPaymentStrategy(creditCard);
        paymentService2.pay();
        paymentService2.setPaymentStrategy(dreditCard);

        paymentService2.pay();
    }
}
