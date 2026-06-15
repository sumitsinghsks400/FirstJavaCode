package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComputRunningSumOfList53 {
    public static void main(String[] args) {
        //Compute Running Sum
        //Question: Compute the running sum of a list of integers.

       List<Integer> numbers= Arrays.asList(1,2,3,4,5);

      List<Integer> value=  IntStream.range(0,numbers.size()).mapToObj(i->numbers.subList(0,i+1).stream().mapToInt(Integer::intValue).sum()).toList();
      System.out.println(value);



        AtomicInteger sum = new AtomicInteger();

        List<Integer> runningSum = numbers.stream()
                .map(sum::addAndGet)
                .collect(Collectors.toList());

        System.out.println(runningSum);
    }
}
