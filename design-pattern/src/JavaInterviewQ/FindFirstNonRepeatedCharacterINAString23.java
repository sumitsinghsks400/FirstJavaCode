package JavaInterviewQ;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacterINAString23 {
    public static void main(String[] args) {
        String s= "sumitkumarsingh";
//These are the Unicode values of the characters. chars()  retun
      //  the returned char is automatically converted to a Character object because mapToObj() creates an object stream.

       LinkedHashMap<Character,Long> allValue=  s.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a, LinkedHashMap::new,Collectors.counting()));
        allValue.entrySet().stream().filter(a->a.getValue()==1).limit(1).forEach(System.out::println);

        LinkedHashMap<Character,Long> map= new LinkedHashMap<>();

        for(char c:s.toCharArray()) {
            map.put(c,map.containsKey(c) ?map.get(c)+1:1);
        }
        System.out.println(map);

        map.entrySet().stream().filter(a->a.getValue()==1).limit(1).forEach(a->System.out.println(a.getKey()));
    }
}
