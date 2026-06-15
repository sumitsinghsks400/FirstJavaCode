package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersFromaList19 {
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,8};

       List<Integer> evenNumber =Arrays.stream(arr).boxed().filter(a->a%2==0).collect(Collectors.toList());

        evenNumber.stream().forEach(System.out::println);

    }
}
