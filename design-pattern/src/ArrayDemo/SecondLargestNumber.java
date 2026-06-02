package ArrayDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7,5,4,3,4,5};
       Optional<Integer> num= Arrays.stream(arr).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
        Optional<Integer> nums= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        Optional<Integer> numss= Arrays.stream(arr).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
        int i = Arrays.stream(arr).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get().intValue();
  System.out.println(i);
        int   max= Arrays.stream(arr).boxed().max(Integer::compareTo).get();

     // System.out.println(max);

       System.out.println(num.get());
    }

}
