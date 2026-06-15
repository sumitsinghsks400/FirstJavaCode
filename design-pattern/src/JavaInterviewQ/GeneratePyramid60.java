package JavaInterviewQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratePyramid60 {
    public static void main(String[] args) {
        //7. Generate a Pyramid Pattern
        //Question: Generate a pyramid of numbers using Streams.

        int levels = 5;

        List<String> pyramid = IntStream.rangeClosed(1, levels)
                .mapToObj(i ->
                        " ".repeat(levels - i) +
                                IntStream.rangeClosed(1, i)
                                        .mapToObj(j -> "*")
                                        .collect(Collectors.joining(" "))
                )
                .collect(Collectors.toList());

        pyramid.forEach(System.out::println);

    }
}
