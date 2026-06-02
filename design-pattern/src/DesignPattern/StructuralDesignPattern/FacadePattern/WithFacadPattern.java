package DesignPattern.StructuralDesignPattern.FacadePattern;
class UserServices {
    public String  getUserDetails(String userId) {

        return "User Details for userId :" + userId;
    }
}
class OrderServices{

    public String  getOrderDetails(String orderId) {

        return "Order Details for orderId :" + orderId;
    }
}

class PaymentServices {
    public String  processPaymebt(String paymentId) {

        return "processing Payment   for paymentId :" + paymentId;
    }
}

class ApiGateWay {
    private  UserService userService ;
    private OrderService orderService ;
   private PaymentService paymentService ;

    public ApiGateWay() {
        this.userService = userService;
        this.orderService = orderService;
        this.paymentService = paymentService;
    }
    //task

    public  String getFullOrderDetails(String  userId ,String orderId, String paymentId) {
        String userDetails =userService.getUserDetails("1234");
        String orderDetails = orderService.getOrderDetails("8766");
        String paymentServices= paymentService.processPaymebt("123344");
        return userDetails + "\n"  + orderDetails + "\n" +  paymentServices ;
    }
}
public class WithFacadPattern {
    public static void main(String[] args) {

        ApiGateWay apiGateWay = new ApiGateWay();

        System.out.println(apiGateWay.getFullOrderDetails("1234", "8766", "123344"));

    }
}
