package JavaInterviewQ;

import java.util.Arrays;

public class FindVouleAndConInString14 {
    public static void main(String[] args) {
        String str= "sdfaegcsbbhsd";

        for(char v: str.toCharArray()) {
           if ("aeiou".indexOf(v) !=-1) {
               System.out.println("aa" + v);
           }
        }

       Arrays.asList(str.split("")).stream().filter("aeiou"::contains).forEach(System.out::println);

        Arrays.asList(str.split("")).stream().filter(s->"aeiou".indexOf(s) !=-1).forEach(System.out::println);
        Arrays.asList(str.split("")).stream().filter(s-> !"aeiou".contains(s)).forEach(System.out::println);

        Arrays.asList(str.split("")).stream().filter("aeiou"::contains).forEach(System.out::println);

    }
}
