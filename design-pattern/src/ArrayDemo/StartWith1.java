package ArrayDemo;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StartWith1 {
    public static void main(String[] args) {
        int[] num= {3,5,11,7,17};

        Arrays.stream(num).boxed().map(a->a+"").filter(a->a.startsWith("1")).forEach(System.out::println);
        IntStream.range(1,10).skip(1).limit(8).forEach(System.out::println);
    }
}
