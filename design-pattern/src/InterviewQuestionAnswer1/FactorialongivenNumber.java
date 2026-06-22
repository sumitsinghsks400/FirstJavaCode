package InterviewQuestionAnswer1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FactorialongivenNumber {
    public static void main(String[] args) {
        int number =5;
 int fraction=1;
        for(int i=1;i<=number;i++){

            fraction *=i;

        }
       int value= freaction(number);
        System.out.println(value);

        System.out.println(fraction);

        int factorial = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);

        System.out.println(factorial);
    }

    private static int freaction(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number*freaction(number-1);
    }
}
