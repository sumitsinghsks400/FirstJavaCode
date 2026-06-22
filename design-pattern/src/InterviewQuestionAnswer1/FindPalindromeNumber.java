package InterviewQuestionAnswer1;

public class FindPalindromeNumber {
    public static void main(String[] args) {
        int origanalNumber=1001;

         if(isPalindular(origanalNumber)) {
             System.out.println("palindrom");
         }else {
             System.out.println("Not Palindrom");
         }
    }

    private static boolean isPalindular(int num) {
        int reverseNumber=0;
        int origanalNumber=num;

        while(num!=0){
         int   r= num%10;
            reverseNumber=reverseNumber*10 +r;

            num= num/10;
        }
        return origanalNumber==reverseNumber;
    }
}
