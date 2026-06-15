package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionEvenOdd36 {
    public static void main(String[] args) {
        //: Partition a list of numbers into even and odd.
        Map<Boolean, List<Integer> >listMap= Arrays.asList(1,2,4,6,7,8,9).stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println(listMap);
       List< List<Integer>> list= listMap.entrySet().stream().map(a->a.getValue().stream().toList()).toList();
       System.out.println(list);

    }
}
