package InterviewQuestionAnswer1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number=10;
        int first = 0, second = 1, next;
        System.out.println("Fibonacci series is ");
        for ( int i = 0; i<=number; i++)
        {
            System.out.print(first + " ");
            next = first+second;
            first = second;
            second = next;
        }

    }
}
