package InterviewQuestionAnswer1;

import java.util.Scanner;

public class SwapTwoStringWithoutUsing3rdVariable {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.println("Before swapping: str1 = " + str1 +
                ", str2 = " + str2);

        // Swapping without using a third variable
        str1 = str1 + str2;

        // Extract original str1 into str2
        str2 = str1.substring(0, str1.length() - str2.length());

        // Extract original str2 into str1
        str1 = str1.substring(str2.length());

        System.out.println("After swapping: str1 = " + str1 +
                ", str2 = " + str2);

        scanner.close();
    }

}
