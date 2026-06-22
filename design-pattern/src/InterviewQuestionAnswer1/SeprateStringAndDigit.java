package InterviewQuestionAnswer1;

import java.util.Scanner;

public class SeprateStringAndDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original String is: "+ input);
        separateAplhaAndNumeric(input);
    }
    public static void separateAplhaAndNumeric(String input)
    {
        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        for(char ch : input.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                alphaPart.append(ch);
            }
            else if (Character.isDigit(ch))
            {
                numericPart.append(ch);
            }

        }
        System.out.println("Output in Alpha: "+alphaPart.toString());
        System.out.println("Output in Numeric: "+numericPart.toString());
    }

}
