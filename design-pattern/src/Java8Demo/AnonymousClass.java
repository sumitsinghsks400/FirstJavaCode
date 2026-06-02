package Java8Demo;

public class AnonymousClass {

    public void m1() {
        System.out.println("Normal Method");
    }

    public static void main(String[] args) {

        // Anonymous class
        AnonymousClass obj = new AnonymousClass() {
            @Override
            public void m1() {
                System.out.println("Anonymous Class Method");
            }
        };

        obj.m1();
    }
}
