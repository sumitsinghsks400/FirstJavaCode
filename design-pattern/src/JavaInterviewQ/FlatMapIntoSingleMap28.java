package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapIntoSingleMap28 {
    public static void main(String[] args) {

     List<List<Integer>>   list= Arrays.asList(Arrays.asList(1,2,3,4,5,6),
                Arrays.asList(1,2,3,4,5,2),
                Arrays.asList(1,2,3,4,5)
                );

     list.stream().flatMap(a->a.stream()).toList().forEach(System.out::println);

        List<Integer>  singleList=   list.stream().flatMap(List::stream).toList();
        System.out.println(singleList);


    }
}
