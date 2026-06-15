package JavaInterviewQ;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringConvertAsAmap35 {
    public static void main(String[] args) {
        //Convert a list of strings into a map with the string as the key and its length as the value.
       Map<String,Integer> map=Arrays.asList("sumit","namit","raj","sohan").stream().collect(Collectors.toMap(word->word,String::length));
       System.out.println(map);
    }
}
