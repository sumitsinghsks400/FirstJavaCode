package JavaInterviewQ;

import java.util.Arrays;

public class ArrayRemoveDublicate8 {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,3,4,5,7};

        Arrays.stream(arr).boxed().distinct().forEach(System.out::println);

        Arrays.asList(arr).stream().forEach(a->
                Arrays.stream(a).boxed().distinct().forEach(System.out::println)
                );


    }

}
