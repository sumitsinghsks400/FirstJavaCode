package InterviewQuestionAnswer1;

import java.util.HashMap;

public class FindDuplicateCharactersInAString {
    public static void main(String[] args) {
        duplicateCharacterCount("Learn Java Programming");
    }

    private static void duplicateCharacterCount(String learnJavaProgramming) {
        HashMap<Character,Integer> map= new HashMap<>();
       char[] ch= learnJavaProgramming.toCharArray();

       for(int i = 0; i< ch.length-1; i++) {
           map.put(ch[i],map.containsKey(ch[i])?ch[i]+1:1);
       }
        System.out.println(map);
    }
}
