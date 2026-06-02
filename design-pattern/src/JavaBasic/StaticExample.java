package JavaBasic;

public class StaticExample {
    static {
        System.out.println("static Block");
    }

    public static void main(String[] args) {
        Demo.display();
        Demo d = new Demo();
        d.displayes();
        System.out.println("main");
        Outer.Inner i= new Outer.Inner();
       i.disply();
    }
}

class Demo {

    static int x=10;
    int y = x;

    static void display() {
        System.out.println("value: "+ x);
        Demo d = new Demo();
        System.out.println(d.y);
        Test t = new Test();
    }
     void displayes() {
        System.out.println("value: "+ y);
    }
}

class Test {
    static {
        System.out.println("static Block");
    }
    static {
        System.out.println("static blocks");
    }
}

class Outer {
    static class Inner {
        void disply() {
            System.out.println("inside Inner");
        }
    }
}

    class StaticMethode {

      static   void display(){
            System.out.println("hello");

        }
           void displays(){
            System.out.println("hello");

        }
        static  void show() {
            display();
            StaticMethode s = new StaticMethode();
            s.displays();
        }


}