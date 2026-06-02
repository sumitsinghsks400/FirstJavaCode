package SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {
    private  NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel) {
        this.notificationChannel=channel;
    }

    public void notify (String sms) {
        notificationChannel.send(sms);
    }
}
