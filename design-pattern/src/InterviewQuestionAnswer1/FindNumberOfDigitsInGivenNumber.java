package InterviewQuestionAnswer1;

public class FindNumberOfDigitsInGivenNumber {
    public static void main(String[] args) {
        int no = -123, a = 0;

        if(no<0)
        {
            no = no * -1;
        } else if (no==0) {
            no=1;
        }
        while(no>0)
        {
            no=no/10;
            a++;}
        System.out.println("Number of digits in given number is :" +a);
    }
}
