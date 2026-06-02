package CollectsDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LargestNthNumber {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("sumit",1200);
        map.put("Namit",1700);
        map.put("Puja",1200);
        map.put("Rajesh",1800);
        map.put("Mohan",1700);



// nth higest number
       Map.Entry<String, Integer> result=  map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList().get(1);
    System.out.println(result);
System.out.println("------------------------");
        // grouping by value
        map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).entrySet().stream().forEach(System.out::println);
  // Sorting by Key
  System.out.println("-----------------------");
        map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList()))).entrySet().stream()
                .forEach(System.out::println);
        System.out.println("-----------------------");
        map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList()))).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach(System.out::println);
        System.out.println("-----------------------");
        map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach(System.out::println);


    }
}
