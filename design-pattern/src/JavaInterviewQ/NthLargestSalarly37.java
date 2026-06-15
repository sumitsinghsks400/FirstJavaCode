package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;

public class NthLargestSalarly37 {
    public static void main(String[] args) {
        //21.	Find Nth Largest Element in a List
        //Question: Find the 3rd largest element in a list.
      int result=  Arrays.asList(1,2,3,4,5,6,7,8).stream().sorted(Comparator.reverseOrder()).skip(8).findFirst().orElseThrow();
      System.out.println(result);

    }
}
