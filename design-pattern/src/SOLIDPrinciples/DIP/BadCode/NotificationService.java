package SOLIDPrinciples.DIP.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SmsService  smsService;

    public  NotificationService(){
        this.smsService=new SmsService();
        this.emailService=new EmailService();
    }

    public void  notifyByEmail(String sms ){
        emailService.sendEmail(sms);
    }

    public void notifyBySms(String sms) {
        smsService.sendsms(sms);
    }

}
