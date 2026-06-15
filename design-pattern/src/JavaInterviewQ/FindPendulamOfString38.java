package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//: Find all strings that are palindromes in a list.


public class FindPendulamOfString38 {
    public static void main(String[] args) {
        Arrays.asList("radar","sumit","level","world","java").stream().filter(a-> a.contentEquals(new StringBuffer(a).reverse())).forEach(System.out::println);
        Stream.of("radar","sumit","level","world","java").filter(a-> a.contentEquals(new StringBuffer(a).reverse())).toList().forEach(System.out::println);

    // Reverse each string in a list.
      List<String> palindromes= Arrays.asList("radar","sumit","level","world","java").stream().filter(a-> a.contentEquals(new StringBuilder(a).reverse())).toList();

      System.out.println(palindromes);

        List<String> reverses= Arrays.asList("radar","sumit","level","world","java").stream().map(a-> new StringBuffer(a).reverse().toString()).toList();
        System.out.println(reverses);

        //Question: Partition strings into palindromes and non-palindromes.

    Map<Boolean,List<String>> map=Arrays.asList("radar","sumit","level","world","java").stream().collect(Collectors.partitioningBy(a-> a.equals(new StringBuilder(a).reverse().toString())));
       System.out.println(map);
    }
}
