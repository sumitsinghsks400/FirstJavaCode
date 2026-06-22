package InterviewQuestionAnswer1;

import java.util.Scanner;

public class PrimaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleace Enter Number");
        int primary = sc.nextInt();

        if (isPrime(primary)) {
            System.out.println("is PrimeNumber");
        } else {
            System.out.println("Not primeNumber");
        }
    }

    private static boolean isPrime(int primary) {
        if (primary < 2) {
            return false;
        }

        for (int i = 2; i <= primary/2; i++) {
            if (primary % i == 0) {
                return false;
            }

        }

        return true;
    }
}

