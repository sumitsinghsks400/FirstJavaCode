package InterviewQuestionAnswer1;

public class CalculateTheSumOfDigitsOfANumber {
    public static void main(String[] args) {
        int number=12345;
        int sum=0;
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum = sum + digit; // Add the digit to sum
            number = number / 10; // Remove the last digit from number
        }
System.out.println(sum);
    }
}
