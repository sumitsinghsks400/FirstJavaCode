package JavaInterviewQ;

import java.util.List;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacter62 {
    public static void main(String[] args) {
        //Find Non-Repeating Characters in a String
        //Question: Find all non-repeating characters in a string.

        String input = "swiss";
        List<Character> nonRepeating = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.chars().filter(ch -> ch == c).count() == 1)
                .collect(Collectors.toList());
        System.out.println(nonRepeating); // Output: [w, i]


    }
}
