package InterviewQuestionAnswer1;

import java.util.stream.Stream;

public class ReverseaAstring {
    public static void main(String[] args) {
        String s= "abbcd";

        Stream.of(s).map(a->new StringBuffer(a).reverse()).forEach(System.out::println);
        StringBuilder rev= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
        rev.append(s.charAt(i));

        }
        System.out.println(rev);
    }
}
