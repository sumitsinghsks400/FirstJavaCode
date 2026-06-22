package InterviewQuestionAnswer1;

public class swaptwonumberswithoutusingthirdvariable {
    public static void main(String[] args) {
        int a=3;
        int b=5;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
