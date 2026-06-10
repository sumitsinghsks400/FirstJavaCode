public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println(test());
    }

    private static String test() {
        try {
            if (1 == 1) throw new RuntimeException();
            return "try";
        } catch (Exception e) {
            return "catch";
        } finally {
            return "finally";
        }
    }

}
