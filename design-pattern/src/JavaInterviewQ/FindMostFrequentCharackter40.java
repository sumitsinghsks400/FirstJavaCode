package JavaInterviewQ;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostFrequentCharackter40 {
    public static void main(String[] args) {
        //: Find the most frequent character in a string.

        String s="sdasdfgfadsgdf";
      Character ch=  s.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet()
                .stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElseThrow();
      System.out.println(ch);
    }
}
