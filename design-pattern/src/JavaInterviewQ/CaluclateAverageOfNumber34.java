package JavaInterviewQ;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CaluclateAverageOfNumber34 {
    public static void main(String[] args) {
        //Calculate the average of a list of integers.
       OptionalDouble average =Arrays.asList(1,2,3,4,5,6,7,7,8).stream().mapToInt(a->(int) a).average();
        OptionalDouble averages = OptionalDouble.of(Arrays.asList(1,2,3,4,5,6,7,7,8).stream().mapToInt(Integer::intValue).average().orElse(0.00));

       System.out.println(averages);
    }
}
