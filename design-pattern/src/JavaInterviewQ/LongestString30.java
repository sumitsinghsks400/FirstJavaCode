package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString30 {
    public static void main(String[] args) {
        String s = Arrays.asList("sumit","mohan","rohan","sohan","mohan","raja").stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).orElse("rrrrrr");


        System.out.println(s);

      String ss=  Arrays.asList("sumit","mohan","rohan","sohan","mohan","raja").stream().max(Comparator.comparing(String::length)).get();
      System.out.println(ss);
    }
}
