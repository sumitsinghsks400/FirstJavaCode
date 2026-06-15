package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckListIsShorted66 {
    public static void main(String[] args) {
        //Check if a List is Sorted
        //Question: Verify if a list is sorted in ascending order.


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean isSorted = IntStream.range(0, numbers.size() - 1)
                .allMatch(i -> numbers.get(i) <= numbers.get(i + 1));
        System.out.println(isSorted); // Output: true
    }
}
