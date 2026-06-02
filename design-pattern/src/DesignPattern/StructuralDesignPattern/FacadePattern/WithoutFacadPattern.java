package DesignPattern.StructuralDesignPattern.FacadePattern;


class UserService {
    public String  getUserDetails(String userId) {

        return "User Details for userId :" + userId;
    }
}
class OrderService{

    public String  getOrderDetails(String orderId) {

        return "Order Details for orderId :" + orderId;
    }
}

class PaymentService {
    public String  processPaymebt(String paymentId) {

        return "processing Payment   for paymentId :" + paymentId;
    }
}
public class WithoutFacadPattern {

    public static void main(String[] args) {
        UserService userService= new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService= new PaymentService();

        System.out.println(userService.getUserDetails("1265"));
    }
}
