package JavaInterviewQ;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfNumberList25 {
    public static void main(String[] args) {
        //Calculate the sum of all numbers in a list.
         //mapToInt() Converts each Integer object into a primitive int. unboxing
        IntStream sums= Arrays.asList(1,2,3,4,5,6,7,7).stream().mapToInt(x-> x);
        IntStream sum= Arrays.asList(1,2,3,4,5,6,7,7).stream().mapToInt(Integer::intValue);
       System.out.println(sum.sum());    }
}
