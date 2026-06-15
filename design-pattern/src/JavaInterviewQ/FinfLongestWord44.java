package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;

public class FinfLongestWord44 {
    //31.	Find the Longest Word from a Sentence
    //Question: Find the longest word in a sentence using Streams.

    public static void main(String[] args) {
       String length= Arrays.asList("sumit","namits","raja","manish").stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).orElseThrow();
   System.out.println(length);

        String value = Arrays.asList("sumit","namits","raja","manish")
                .stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(value);
    }
}
