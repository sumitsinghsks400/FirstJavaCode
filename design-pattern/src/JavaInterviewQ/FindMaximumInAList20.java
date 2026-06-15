package JavaInterviewQ;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindMaximumInAList20 {
    public static void main(String[] args) {
       int max= Arrays.asList(10,23,40,60,80).stream().max(Integer::compareTo).get();
       System.out.println(max);

      int value= Arrays.asList(4,5,3,2,4).stream().max((a,b)->a>b?1:-1).get();
      System.out.println(value);

    }
}
