package JavaInterviewQ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfInteger16 {
    public static void main(String[] args) {
        int arr[]= {1,5,7,9,6,8};

        Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();

        Arrays.stream(arr).boxed().collect(Collectors.summingInt(Integer::intValue));





    }
}
