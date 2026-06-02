package SOLIDPrinciples.DIP.GoodCode;

public class SmsService  implements  NotificationChannel{


    @Override
    public void send(String message) {
        System.out.println("sending sms" +message);
    }
}
