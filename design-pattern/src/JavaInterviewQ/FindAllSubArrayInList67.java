package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllSubArrayInList67 {
    public static void main(String[] args) {
        //6. Find All Subarrays of a List
        //Question: Generate all contiguous subarrays of a list.

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<List<Integer>> subarrays = IntStream.range(0, numbers.size())
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(i + 1, numbers.size())
                        .mapToObj(j -> numbers.subList(i, j)))
                .collect(Collectors.toList());
        System.out.println(subarrays); // Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3],

    }
}
