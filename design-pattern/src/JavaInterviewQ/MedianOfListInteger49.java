package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfListInteger49 {
    public static void main(String[] args) {
         //36.	Find Median of a List
        //Question: Find the median of a list of integers.
//Handle Both Odd and Even Sized Lists
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5);
        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
        double median = (sorted.size() % 2 == 0)
                ? (sorted.get(sorted.size() / 2 - 1) + sorted.get(sorted.size() / 2)) / 2.0
                : sorted.get(sorted.size() / 2);
        System.out.println(median); // Output: 3.0

    }
}
