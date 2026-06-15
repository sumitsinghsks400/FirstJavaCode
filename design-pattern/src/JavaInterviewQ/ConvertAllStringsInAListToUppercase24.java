package JavaInterviewQ;

import java.util.Arrays;

public class ConvertAllStringsInAListToUppercase24 {
    public static void main(String[] args) {
        Arrays.asList("sumit","namit","mohan","ram").stream().map(uperCase->uperCase.toUpperCase()).forEach(System.out::println);

        Arrays.asList("sumit","namit","mohan","ram").stream().map(String::toUpperCase).forEach(System.out::println);
    }


}
