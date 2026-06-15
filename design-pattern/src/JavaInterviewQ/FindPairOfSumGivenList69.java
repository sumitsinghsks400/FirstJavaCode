package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPairOfSumGivenList69 {
    public static void main(String[] args) {
        //8. Find Pair of Numbers with a Given Sum
        //Question: Find all pairs of numbers from a list that add up to a given sum.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int targetSum = 6;
        List<List<Integer>> pairs = numbers.stream()
                .flatMap(a -> numbers.stream()
                        .filter(b -> a + b == targetSum && a < b)
                        .map(b -> Arrays.asList(a, b)))
                .collect(Collectors.toList());
        System.out.println(pairs); // Output: [[1, 5], [2, 4]]

    }
}
