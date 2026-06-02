package JavaBasic;

public class StatiCMethodeOverLoad {
    public static void main(String[] args) {
        Child c = new Child();
        Child.showe();
        c.showe();
        c.show();
        Cal.add(12);
        Cal.add(12,44);
    }
}
 class Parent {
     static void show() {
         System.out.println("parent");

     }
 }

    class Child  extends  Parent  {
        static  void  showe() {
            System.out.println("child");
        }
    }

    class Cal {
    static  void  add(int a) {
        System.out.println(a);
    }
        static  void  add(int a,int b) {
            System.out.println(a+b);
        }
    }