package InterviewQuestionAnswer1;

import java.util.Arrays;

public class DetermineIfTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1,str2));

    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length-1; i++) {
            if(arr1[i]==arr2[i]) {
                return  true;
            }
        }

        return  false;//Arrays.equals(arr1, arr2);
    }
}
