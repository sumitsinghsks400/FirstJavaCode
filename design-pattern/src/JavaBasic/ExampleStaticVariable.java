package JavaBasic;

public class ExampleStaticVariable {

    static  int totalStudents =0;

    ExampleStaticVariable() {
        totalStudents++;
        System.out.println(totalStudents);

    }

    public static void main(String[] args) {
        new ExampleOfLocalInstanceAndStaticVariable();
        new ExampleOfLocalInstanceAndStaticVariable();
        new ExampleOfLocalInstanceAndStaticVariable();

        System.out.println(ExampleStaticVariable.totalStudents);
    }
}
