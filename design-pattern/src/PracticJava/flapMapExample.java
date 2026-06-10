package PracticJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flapMapExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1030);
        arrList1.add(1020);
        arrList1.add(1010);
        arrList1.add(1040);
        System.out.println(arrList1);
        // Join two ArrayList
        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(1050,1060,1070));
        System.out.println(arrList2);
        List<Integer> arrList3 = Stream.of(arrList1, arrList2)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        List<Stream<Integer>> arrList4 = Stream.of(arrList1, arrList2)
                .map(x -> x.stream())
                .collect(Collectors.toList());
        arrList4.stream().forEachOrdered(e->System.out.println(e));
        System.out.println("After Joining:");
        System.out.println(arrList3);
    }
}
