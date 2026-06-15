package JavaInterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortListOfIntegersIndescendingOrder21 {
    public static void main(String[] args) {

        int arr[]={1,3,2,6,2,8};
        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

        Arrays.asList(1,3,2,6,2,8).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
