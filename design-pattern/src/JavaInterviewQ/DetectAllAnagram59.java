package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DetectAllAnagram59 {
    public static void main(String[] args) {
        //6. Detect Anagrams in a List
        //Question: Detect all anagrams in a list of strings.
        List<String> words = Arrays.asList("listen", "silent", "enlist", "google", "elbow");

        Map<String, List<String>> anagrams = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word.chars().sorted()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining())
                ));
        System.out.println(anagrams);


    }
}
