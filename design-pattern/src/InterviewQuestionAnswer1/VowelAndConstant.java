package InterviewQuestionAnswer1;

public class VowelAndConstant {
    public static void main(String[] args) {
        String str = "Hello World";
 str.chars().mapToObj(a->(char)a).filter(v->"aeiou".contains(String.valueOf(v))).forEach(System.out::println);

    for (char c:str.toCharArray()) {
        if('a'==c || 'e' == c) {
            System.out.println(c);
        }
    }
    }
}
