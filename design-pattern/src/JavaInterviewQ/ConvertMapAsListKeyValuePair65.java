package JavaInterviewQ;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapAsListKeyValuePair65 {
    public static void main(String[] args) {
        //. Convert Map to List of Key-Value Pairs
        //Question: Convert a map to a list of “key=value” strings.
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        List<String> keyValuePairs = map.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.toList());
        System.out.println(keyValuePairs); // Output: [A=1, B=2, C=3]


    }
}
