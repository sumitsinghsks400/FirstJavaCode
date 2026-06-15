package JavaInterviewQ;

import java.util.Arrays;

public class ParllelStreamComputSum31 {
    public static void main(String[] args) {
        //: Use parallel streams to compute the sum of numbers.

       int sum= Arrays.asList(1,3,4,5,6,7).parallelStream().mapToInt(Integer::intValue).sum();

       System.out.println(sum);
    }
}
