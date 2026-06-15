package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;

public class ComanValueOfToList41 {
    public static void main(String[] args) {
        //Question: Find common elements between two lists.
      List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
      List<Integer> list2= Arrays.asList(7,8,9,5,6);
//  list1.stream().filter(a->list2.contains(a).toList();
      List<Integer>  comman= list1.stream().filter(list2::contains).toList();
      System.out.println(comman);




    }
}
