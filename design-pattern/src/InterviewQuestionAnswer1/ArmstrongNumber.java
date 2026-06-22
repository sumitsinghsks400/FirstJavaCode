package InterviewQuestionAnswer1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=123;
        int arm=0;
        int d= 123;
        int a=0;

        while(num>0)
        {
            a = num%10;
            num = num/10;
            arm =arm+a*a*a;
        }

        if(arm == d){
            System.out.println("Armstrong  number");

        }
        else{
            System.out.println("Not Armstrong number");
        }



    }
}
