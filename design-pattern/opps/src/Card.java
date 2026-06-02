abstract public class Card implements PaymentMethod{
    private  String cardNo;
    private String userName;


    public Card(String userName, String cardNo) {
        this.userName = userName;
        this.cardNo = cardNo;
    }
     public String getCardNo() {
        return cardNo;
     }
     public String getUserName() {
        return userName;
     }

}
