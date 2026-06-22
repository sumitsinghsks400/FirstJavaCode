package InterviewQuestionAnswer1;

public class RemoveSpaceFromAGivenString {
    public static void main(String[] args) {
      String input=  "Welcome to Java World";

        String stringWithoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " +
                stringWithoutSpaces);
    }
    public static String removeSpaces(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

}
