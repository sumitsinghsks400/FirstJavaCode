package JavaInterviewQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonnicaSequance54 {
    public static void main(String[] args) {
        //1. Generate Fibonacci Sequence Using Streams
        //Question: Generate the first N numbers in the Fibonacci sequence.
        int n = 10;

        List<Integer> fibonacci = Stream.iterate(
                        new int[]{0, 1},
                        t -> new int[]{t[1], t[0] + t[1]}
                )
                .limit(n)
                .map(t -> t[0])
                .collect(Collectors.toList());

        System.out.println(fibonacci);

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;

        }

    }
}
