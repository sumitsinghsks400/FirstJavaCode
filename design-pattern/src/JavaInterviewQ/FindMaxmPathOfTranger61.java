package JavaInterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMaxmPathOfTranger61 {
    public static void main(String[] args) {
        //. Find Maximum Path Sum in a Triangle
        //Question: Given a triangle of numbers, find the maximum path sum using
        //Streams

        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(7, 4),
                Arrays.asList(2, 4, 6),
                Arrays.asList(8, 5, 9, 3)
        );

        int maxPathSum = IntStream.range(0, triangle.size())
                .mapToObj(i -> triangle.get(triangle.size() - 1 - i))
                .reduce((rowBelow, currentRow) ->
                        IntStream.range(0, currentRow.size())
                                .mapToObj(j ->
                                        currentRow.get(j)
                                                + Math.max(
                                                rowBelow.get(j),
                                                rowBelow.get(j + 1)
                                        )
                                )
                                .collect(Collectors.toList())
                )
                .orElse(Collections.emptyList())
                .get(0);

        System.out.println(maxPathSum);

    }
}
