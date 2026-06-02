import java.util.HashMap;

public class PaymentService {

    HashMap<String,PaymentMethod> paymentMethods;

    public PaymentService() {
        this.paymentMethods = new HashMap<>();
    }

    public  void  addPaymentMethod(String name, PaymentMethod pm) {
        paymentMethods.put(name,pm);
    }

    public void  makePayment(String name) {
      PaymentMethod pm=  paymentMethods.get(name);
      pm.pay();//run time polymorphism
    }
}
