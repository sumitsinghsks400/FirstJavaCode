package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SlidingWindowOfNElements58 {
    public static void main(String[] args) {
        //Sliding Window of N Elements
        //Question: Create a sliding window of size 3 for a list of integers.
//What is a Sliding Window?
//
//A sliding window of size 3 means:

        //Step 2: IntStream.range(0, numbers.size() - 2)
        //IntStream.range(0, 3)
        //IntStream.range(0, 3)
        //
        //Why 3?
        //
        //5 - 2 = 3
        //
        //Generates:
        //
        //0
        //1
        //2
        //
        //Think of these as starting indexes of each window.
  //Why subtract 2?
        //
        //Window size = 3
        //
        //If we start at index:
        //
        //0 → [1,2,3]
        //1 → [2,3,4]
        //2 → [3,4,5]

        //Therefore last valid start index is:
        //
        //size - windowSize
        //= 5 - 3
        //= 2
        //
        //That's why:
        //
        //IntStream.range(0, numbers.size() - 2)
        //Step 3: mapToObj()
        //.mapToObj(i -> numbers.subList(i, i + 3))
        //
        //For every index i, create a window.
        //
        //First Iteration
        //i = 0
        //
        //Executes:
        //
        //numbers.subList(0, 3)
        //
        //Remember:
        //
        //subList(start, end)
        //
        //includes:
        //
        //start index ✓
        //end index ✗
        //
        //So:
        //
        //numbers.subList(0,3)
        //
        //means:
        //
        //Index 0 -> 1
        //Index 1 -> 2
        //Index 2 -> 3
        //
        //Result:
        //
        //[1,2,3]
        //Second Iteration
        //i = 1
        //
        //Executes:
        //
        //numbers.subList(1,4)

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,9);

        List<List<Integer>> slidingWindows = IntStream.range(0, numbers.size()-2)
                .mapToObj(i -> numbers.subList(i, i + 3))
                .collect(Collectors.toList());
        System.out.println(slidingWindows);

    }
}
