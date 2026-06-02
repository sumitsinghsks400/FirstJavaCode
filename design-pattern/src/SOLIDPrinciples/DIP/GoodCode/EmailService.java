package SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements  NotificationChannel{





    @Override
    public void send(String message) {
        System.out.println("sending mail" +message);
    }
}
