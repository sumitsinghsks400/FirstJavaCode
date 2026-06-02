package Java8Demo;

public class LamdaFunction {
    public static void main(String[] args) {
//        Test t = new Test();
//        t.add(1,2);
//        t.multip();
//        t.multips(5,9);
//        Calculator.add();
//        Calculator.add(45);
//        Calculator.adds(2,4);

    Calculator a = (x,y)->  {System.out.println(x+y);
    };
    a.add(2,8);
    a.multip();
    a.multips(5,7);

        Calculator.add();
       Calculator.add(45);
       Calculator.adds(2,4);
    }
}
// basic
class Test implements Calculator {

    @Override
    public void add(int a, int b) {
        System.out.println(a +b);
    }

    @Override
    public void multip() {
        Calculator.super.multip();
    }

    @Override
    public void multips(int a, int b) {
       System.out.println("ddddd" + (a + b));
    }
}

interface Calculator{
     void add(int a,int b);

    static void add() {
        System.out.println("add");
    }
    static void add(int a) {
        System.out.println("add :-" + a);
    }
    static void adds(int a,int b) {
        System.out.println("add:-" +a+b );
    }
    default void  multip() {
        System.out.println("multiple");
    }
    default void  multips(int a,int b) {
        System.out.println("multiple :-" + a*b);
    }
}