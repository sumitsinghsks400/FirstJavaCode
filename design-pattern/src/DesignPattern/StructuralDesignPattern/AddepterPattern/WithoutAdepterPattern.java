package DesignPattern.StructuralDesignPattern.AddepterPattern;
class EmailNotificationService  implements  NotificationService{
    @Override
  public   void send(String to,String subject, String body) {
        System.out.println("sending email to "+ to);
        System.out.println("Subject " + subject);
        System.out.println("Body :"+ body);
    }
}
 interface NotificationService {
     void send(String to,String subject, String body);
 }

 class SendGridService {
    public void  sendEmail (String recipient, String title, String content) {
        System.out.println("Sending email vai sendGrid to " + recipient + "title "+ title +"content " + content);
    }
 }
public class WithoutAdepterPattern {
    public static void main(String[] args) {
        NotificationService notificationService= new EmailNotificationService();

        notificationService.send("custmer@", "order conformation ", "your order place sucessucfully");

       // NotificationService notificationServices= new SendGridService();// it will need to impliment  Notif
    }

}
