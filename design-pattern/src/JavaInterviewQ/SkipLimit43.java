package JavaInterviewQ;

import java.util.Arrays;

public class SkipLimit43 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5,6,67,7,7,8).stream().sorted().skip(3).limit(2).forEach(System.out::println);
    }
}
