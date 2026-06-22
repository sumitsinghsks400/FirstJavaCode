package InterviewQuestionAnswer1;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInAString {
    public static void main(String[] args) {
        duplicateCharacterCount("Learn Java Programming");
    }

    private static void duplicateCharacterCount(String learnJavaProgramming) {
        HashMap<Character,Integer> map= new HashMap<>();
        String str = learnJavaProgramming.replace(" ", "");
        char[] ch = str.toCharArray();

       for(char c:ch) {
         //  ASCII value of 'a' = 97
           map.put(c,map.containsKey(c)?map.get(c)+1:1);
       }
        System.out.println(map);
       for (Map.Entry<Character, Integer> a: map.entrySet()) {
           if(a.getValue() >1) {
               System.out.println(a);
           }
       }
    }
}
