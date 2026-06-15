package JavaInterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortListOFFrequencyElement72 {
    public static void main(String[] args) {
        //61. Sort a List Based on Frequency of Elements
        //Question: Sort a list based on the frequency of elements in descending order.

        List<Integer> numbers = Arrays.asList(4, 5, 6, 5, 4, 3);
        List<Integer> sortedByFrequency = numbers.stream()
                .sorted(Comparator.comparingInt(n -> -Collections.frequency(numbers, n)))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(sortedByFrequency); // Output: [4, 5, 6, 3]

    }
}
