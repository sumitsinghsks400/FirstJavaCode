package JavaInterviewQ;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberPrient70 {
    public static void main(String[] args) {
        //Generate Random Numbers Using Stream
        //Question: Generate a list of random numbers using Stream.
        List<Integer> randomNumbers = new Random().ints(5, 1, 100) // 5 numbers in range
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomNumbers); // Example Output: [45, 23, 89, 12, 78]

    }
}
