package Thread;

public class HelloThread  extends Thread{

    @Override
    public void run() {
       System.out.println("hello thread");
    }
}
 class HelloThread1 implements  Runnable {

     @Override
     public void run() {
         System.out.println("hello Thread Runnable");
     }
 }

 class Hello {
    public static void sayHello() {
        System.out.println("Hello Thread  Methode Refrance ");
    }
 }

