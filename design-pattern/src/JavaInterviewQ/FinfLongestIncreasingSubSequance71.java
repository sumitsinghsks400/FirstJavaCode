package JavaInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FinfLongestIncreasingSubSequance71 {
    public static void main(String[] args) {
        //. Find Longest Increasing Subsequence
        //Question: Find the longest increasing subsequence in a list.

        List<Integer> numbers = Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18);
        List<Integer> lis = new ArrayList<>();
        numbers.forEach(num -> {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) pos = -(pos + 1);
            if (pos < lis.size()) lis.set(pos, num);
            else lis.add(num);
        });
        System.out.println(lis); // Output: [2, 3, 7, 101]

    }
}
