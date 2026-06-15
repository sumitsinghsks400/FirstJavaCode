package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComputeTwoList45 {
    public static void main(String[] args) {
        //	Compute Cartesian Product of Two Lists
        //Question: Compute the Cartesian product of two lists of integers.

        List<Integer> list1=Arrays.asList(1,2,3);
        List<Integer> list2=Arrays.asList(4,5);

      List<String> string=  list1.stream().flatMap(i->list2.stream().map(j->"(" + i+ " " + j+ ")")).toList();

      System.out.println(string);
    }
}
