package JavaInterviewQ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintFrequencyString27 {
    public static void main(String[] args) {
        //: Group a list of strings based on their length.
        Arrays.asList("sumit","mohan","rohan","sohan","mohan","raja").stream().collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().forEach(System.out::println);
    }
}
