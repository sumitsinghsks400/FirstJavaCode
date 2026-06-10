package JavaInterviewQ;

import java.util.Arrays;

public class EvenOddNumber12 {
    public static void main(String[] args) {
        int arr[]= {3,6,7,8,9,4,5};
        Arrays.stream(arr).boxed().filter(a->a%2==0).forEach(System.out::println);
        Arrays.stream(arr).boxed().filter(a->a%2!=0).forEach(System.out::println);

       int sum= Arrays.stream(arr).boxed().filter(a->a%2!=0).reduce(0,Integer::sum);
System.out.println(sum);

    }
}
