package JavaInterviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNonReaptCharcaterAndCount11 {
    public static void main(String[] args) {


        String s = "fddfgdgfddh";

       String value= String.valueOf(Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(a->a , LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(f->f.getValue()==1).findFirst().get());

       System.out.println(value);
        String string ="abacde";

        for(int i=0;i<string.length();i++) {
            boolean falg=true;
            for (int j=0;j<string.length();j++) {
                if (i !=j && string.charAt(i)==string.charAt(j)) {
                    falg=false;
                    break;
                }
            }

            if(falg) {
                System.out.println(string.charAt(i));
            }
        }

        String s1= "AABCDACF";

        HashMap<Character, Integer> hashMap = new HashMap<>();


        for(int i=0;i<s.length();i++) {
            char charAt = s.charAt(i);
            /*
             * if(hashMap.containsKey(charAt)) { hashMap.put(charAt,hashMap.get(charAt)+ 1);
             * } else { hashMap.put(charAt, 1); }
             */
            hashMap.put(charAt, hashMap.containsKey(charAt)?hashMap.get(charAt)+ 1:1 );
        }

        System.out.println(hashMap);

        hashMap.entrySet().stream().filter(a->a.getValue()==1).forEachOrdered(a->System.out.println(a.getKey()));
        System.out.println("===");
        for(Map.Entry<Character, Integer> enterySet:hashMap.entrySet())
            if(enterySet.getValue() ==1) {
                System.out.println(enterySet.getKey());
            }
        System.out.println("-----------");

        String inputStr ="AABCDACF";
        boolean flag = true;

        for(char i :inputStr.toCharArray())
        {
            // if current character is the last occurrence in the string
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    }
    }

