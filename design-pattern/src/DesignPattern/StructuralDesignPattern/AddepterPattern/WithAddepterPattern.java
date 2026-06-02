package DesignPattern.StructuralDesignPattern.AddepterPattern;
class EmailNotificationServices  implements  NotificationServices{
    @Override
    public   void send(String to,String subject, String body) {
        System.out.println("sending email to "+ to);
        System.out.println("Subject " + subject);
        System.out.println("Body :"+ body);
    }
}
interface NotificationServices {
    void send(String to,String subject, String body);
}

class SendGridServices {

    public void sendEmail(String recipient, String title, String content) {
        System.out.println("Sending email vai sendGrid to " + recipient + "title " + title + "content " + content);
    }
}
 class SendGrideAdapter implements NotificationServices {
     private  SendGridServices service;
     public  SendGrideAdapter(SendGridServices sendGridService) {
         this.service= sendGridService;
     }
     @Override
     public void send(String to, String subject, String body) {
         service.sendEmail(to,subject,body);
     }


}
public class WithAddepterPattern {
    public static void main(String[] args) {

            NotificationServices notificationService= new EmailNotificationServices();

            notificationService.send("custmer@", "order conformation ", "your order place sucessucfully");

           NotificationServices notificationServices= new SendGrideAdapter(new SendGridServices());
        notificationServices.send("custmer@", "order conformation ", "your order place sucessucfully");
    }
}
