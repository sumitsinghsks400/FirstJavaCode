package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringSToSentance73 {
    public static void main(String[] args) {
        //Convert List of Strings to Sentence Case
        //Question: Convert a list of strings to sentence case.
        List<String> words = Arrays.asList("java", "stream", "api");

        List<String> sentenceCase = words.stream()
                .map(word -> word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase())
                .collect(Collectors.toList());

        System.out.println(sentenceCase);

    }
}
