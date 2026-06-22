package InterviewQuestionAnswer1;

public class PrintEachLetterTwiceFRomAGivenString {
    public static void main(String[] args) {
        String s="sumit";
        StringBuffer result= new StringBuffer();

        for(char c: s.toCharArray()) {
            result.append(c).append(c);
        }
        System.out.println(result);
    }
}
