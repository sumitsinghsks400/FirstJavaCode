package SOLIDPrinciples.DIP.GoodCode;

public class main {
    public static void main(String[] args) {
        NotificationService enailNotification= new NotificationService(new EmailService());
        NotificationService smsNotification= new NotificationService(new SmsService());

        enailNotification.notify("your order  shift");
        smsNotification.notify("your otp 1234 ");
    }
}
