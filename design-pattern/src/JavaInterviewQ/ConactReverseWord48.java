package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;

public class ConactReverseWord48 {
    public static void main(String[] args) {
        //35.	Custom Reduce to Concatenate Strings
        //Question: Concatenate strings in reverse order using reduce.

        List<String> words = Arrays.asList("Stream", "API", "is", "awesome");
      String reverse=  words.stream().reduce((word1,word2)->word2 + " " +word1).orElse("");
     System.out.println(reverse);
    }
}
