package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupinfByFirstCharacter47 {
    public static void main(String[] args) {
        //34.	Group by First Character
        //Question: Group a list of strings by their first character.

        Map<Character, List<String>> first=Arrays.asList("apple","anoride","cat","dog").stream()
                .collect(Collectors.groupingBy(word->word.charAt(0)));

        System.out.println(first);

    }
}
