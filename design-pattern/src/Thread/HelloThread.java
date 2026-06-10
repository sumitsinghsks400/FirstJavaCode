package Thread;

public class HelloThread  extends Thread{

    public static void main(String[] args) throws InterruptedException {
        new HelloThread().start();
        HelloThread  t1= new HelloThread();
        t1.setName("Thread 3");

        Thread t2= new Thread(Hello::sayHello);
        Thread t3= new Thread(Hello::sayHello);


        t1.start();
        t2.start();
       // t1.setPriority(3);
       // t2.setPriority(1);
        t1.join();
        t2.join();
        t3.start();


    }

    @Override
    public void run() {

       System.out.println("hello thread:-" +Thread.currentThread().threadId() + " name" + Thread.currentThread().getName());

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

