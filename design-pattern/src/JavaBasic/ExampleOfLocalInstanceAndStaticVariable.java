package JavaBasic;

public class ExampleOfLocalInstanceAndStaticVariable {
    //Instance Variable
    String name= "Sumit";
    //Static Variable
    static String school  = "DPS";
    void  display() {
        //local variable
        int age =18;
        System.out.println("Name :" + name);
        System.out.println("School: " + school);
        System.out.println("age "+ age);
    }
    public static void main(String[] args) {
        ExampleOfLocalInstanceAndStaticVariable e = new ExampleOfLocalInstanceAndStaticVariable();
        e.display();
        System.out.println("School: " + ExampleOfLocalInstanceAndStaticVariable.school);
    }
}
