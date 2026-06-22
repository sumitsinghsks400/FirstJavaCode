package InterviewQuestionAnswer1;

public class PrintEvenIndexedCharacters {
    public static void main(String[] args) {
        String s = "Automation";
        for(int i =0;i< s.length();i++) {
            if(i%2==0){
                System.out.println(s.charAt(i));
            }
        }
    }
}
