package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxmVolum52 {
    public static void main(String[] args) {
        //9. Find the Word with Maximum Vowels
        //Question: Find the word with the most vowels in a list.

        List<String> words = Arrays.asList(
                "Java",
                "Programming",
                "Developer",
                "OpenAI",
                "Education"
        );

        String result = words.stream()
                .max(Comparator.comparingLong(word ->
                        word.toLowerCase()
                                .chars()
                                .filter(ch -> "aeiou".indexOf(ch) >= 0)
                                .count()))
                .orElse("");

        String wordWithMaxVowels = words.stream()
                .max(Comparator.comparingInt(
                        s -> (int) s.toLowerCase()
                                .chars()
                                .filter(c -> "aeiou".indexOf(c) != -1)
                                .count()))
                .orElse(null);
        System.out.println(result);

    }
}
