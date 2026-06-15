package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList39 {
    public static void main(String[] args) {
        //Question: Given a map, filter entries with values greater than 10 and collect keys into a list.
       List<String> key= Map.of("A", 5, "B", 10, "C", 12, "D", 16).entrySet().stream().filter(a->a.getValue()>10)
                .map(Map.Entry::getKey).toList();
       System.out.println(key);
    }
}
