package JavaInterviewQ;

import java.util.Arrays;

public class CountStringStartWithA22 {
    public static void main(String[] args) {
        Arrays.asList("Asdfd","sumit","Namit","Amritesh").stream().filter(a->a.startsWith("A")).toList().forEach(System.out::println);

    }
}
