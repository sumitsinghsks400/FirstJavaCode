package JavaInterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FinfDuplicate64 {
    public static void main(String[] args) {
        //. Find Duplicate Elements in a List
        //Question: Identify all duplicate elements in a list.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
