package Thread;

public class ThreadPriorityAndJoin {
    public static void main(String[] args) {
        Thread threadA= new Thread(
                ()-> {
                    for(int i=1;i<=5;i++) {
                        System.out.println("Thread A -count :" + i);

                        try{
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );

        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main thread ended");  //after use join methode main thread will print last
        System.out.println("----------------------");
        Thread thread1= new Thread(new PriorityExample("Thread A"));
        Thread thread2= new Thread(new PriorityExample("Thread B"));
        Thread thread3= new Thread(new PriorityExample("Thread C"));
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

 class PriorityExample  implements  Runnable {
     private final String name;

     PriorityExample(String name) {
         this.name = name;
     }

     @Override
     public void run() {
         for (int i = 1; i <= 5; i++) {
             System.out.println(name + "count :" + ", Priority : " + Thread.currentThread().getPriority());

             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }
 }