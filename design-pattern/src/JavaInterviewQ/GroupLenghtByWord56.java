package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupLenghtByWord56 {
    public static void main(String[] args) {
        //Group Words by Length and Sort Them
        //Question: Group words by their length and sort each group alphabetically.

        List<String> words = Arrays.asList("java", "stream", "api", "example", "code","test");
        Map<Integer,List<String>> lists=words.stream().collect(Collectors.groupingBy(String::length,Collectors.collectingAndThen(Collectors.toList(), list->list.stream().sorted().toList())));
   System.out.println(lists);
    }
}
