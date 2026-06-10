package Thread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread();
        th.start();
         Thread thread = new Thread(()-> System.out.println("hello from java Thread"));
         thread.start();

         Runnable runnable= ()->System.out.println("Hi from java thread");
         Thread t = new Thread(runnable);
          t.start();

          HelloThread  h = new HelloThread();
          h.start();

          HelloThread1 helloThread1 = new HelloThread1();
          Thread t1 = new Thread(helloThread1);
          t1.start();

          Thread meth= new Thread(Hello::sayHello);
          meth.start();
         // meth.join();

        System.out.println("Hello from main thread");
    }
}
