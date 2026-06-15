package JavaInterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IdentifyDuplicateElement {
    public static void main(String[] args) {
        //	Find Duplicate Elements in a List
        //Question: Identify duplicate elements in a list.// give  deblicate number only
        Set<Integer> uniqueSet= new HashSet<>();
        Arrays.asList(1,2,3,1,2,4,5,6,9,5).stream().filter(a->!uniqueSet.add(a)).forEach(System.out::println);
    System.out.println("aaaaa");
        uniqueSet.forEach(System.out::println);

        System.out.println("-----------------------");

        Arrays.asList(1,2,3,1,2,4,5,6,9,5).stream().collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream()
                .filter(a->a.getValue()>1).map(a->a.getKey()).forEach(System.out::println);


    }
}
