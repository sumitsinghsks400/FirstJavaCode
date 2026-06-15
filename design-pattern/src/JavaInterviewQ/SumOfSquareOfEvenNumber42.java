package JavaInterviewQ;

import java.util.Arrays;

public class SumOfSquareOfEvenNumber42 {
    public static void main(String[] args) {
        // Calculate the sum of squares of all even numbers in a list.

        //mapToInt() converts a Stream<Integer> into an IntStream. During this conversion, the Integer elements are auto-unboxed to primitive int values.
        // This avoids boxing overhead and allows numeric operations such as sum(), average(), max(), and min() directly on the stream.
        Arrays.asList(1,2,3,4,5,6,7,8).stream().filter(a->a%2==0).mapToInt(n->n*n).forEach(System.out::println);
    }
}
