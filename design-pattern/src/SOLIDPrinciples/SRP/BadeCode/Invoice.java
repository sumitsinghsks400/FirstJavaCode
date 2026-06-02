package SOLIDPrinciples.SRP.BadeCode;
//bade code -- single pringple told to separete  the methode
public class Invoice {
     private double amount;

     public Invoice(double amount) {
         this.amount=amount;
     }

     public void  generateInvoice() {
         System.out.println("Invoice generate and print amount :-"+amount);
     }

     public void  savedatabase() {
         System.out.println("saving invoice to data base");

    }

    public void sendingEmail() {
         System.out.println(" sending email notification for voice");
    }
}
