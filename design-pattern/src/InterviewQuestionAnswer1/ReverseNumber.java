package InterviewQuestionAnswer1;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=45678;
        int reverse=0;
        int r=0;

        while(num>0) {
            r= num%10;
            reverse= reverse*10+r;
            num= num/10;
        }
        System.out.println("reverse :-" + reverse);
    }
}
