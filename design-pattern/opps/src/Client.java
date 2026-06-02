public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.addPaymentMethod("sumitfe",new DebitCard("123344","sumitDebitCard"));
        ps.addPaymentMethod("sumitcr",new CreditCard("123344","sumitCrebitCard"));
        ps.addPaymentMethod("sumitupi",new UPI("123344"));
        ps.addPaymentMethod("sumitWallet",new Wallet());

ps.makePayment("sumitupi");
ps.makePayment("sumitcr");
ps.makePayment("sumitWallet");


    }
}
