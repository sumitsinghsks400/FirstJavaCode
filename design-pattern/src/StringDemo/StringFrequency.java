package StringDemo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequency {
    public static void main(String[] args) {
        String str="abcabcgdfghad";

        str.chars().mapToObj(a->(char) a).collect(Collectors.groupingBy(Character::charValue,Collectors.counting() )).entrySet()
                .stream().forEach(System.out::println);
       // DUBLICATE FIND
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(a->a, Collectors.counting())).entrySet()
                .stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).forEach(b->System.out.println(b));
        System.out.println("-------------");

        // NON REPEATE CHAR FIRST

   String c=   Arrays.stream(str.split("")).collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(a->a.getValue()==1).findFirst().get().getKey();

   System.out.println(c);
    }
}
