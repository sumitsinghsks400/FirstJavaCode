package InterviewQuestionAnswer1;

import java.util.HashSet;

public class findthelongestwithoutrepeatingcharactersInString {
    public static void main(String[] args) {
        String s ="abcabcbb";

        System.out.println("Longest substring without repeating characters in s1: " + lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            char currentChar = s.charAt(end);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
