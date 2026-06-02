package Thread;

public class SynchroizedBlockAndKeyWordAndWithoutSynchronizes {
    public static void main(String[] args) throws InterruptedException {
        Counter counter= new Counter();
        Runnable UnSynchronizedTask =()->{
           for (int i=0;i<1000;i++) {
               counter.increamentUnSynchronized() ;
           }
        };
   /*     Thread thread= new Thread(UnSynchronizedTask);
        Thread thread1= new Thread(UnSynchronizedTask);
      thread.start();
      thread1.start();
      thread.join(); // waiting for main methode to compete task
      thread1.join();

      System.out.println("unSynchronized value : "+counter.getCount() );*/

        Runnable synchronizedTask =()->{
            for (int i=0;i<1000;i++) {
                counter.increamentSynchronized() ;
            }
        };
        Thread thread2= new Thread(synchronizedTask);
        Thread thread3= new Thread(synchronizedTask);

        thread2.start();
        thread3.start();
        thread2.join(); // waiting for main methode to compete task
        thread3.join();

        System.out.println("Synchronized value : "+counter.getCount() );
    }
}
  class Counter{
    private  int count=0;

      public int getCount() {
          return count;
      }
      void  increamentUnSynchronized(){
          count++;
      }
//Synchronize Key Word
       synchronized void  increamentSynchronized(){
          count++;
      }
//syn block where we are used  code in block
       void  increamentSynchronizedBlock(){
          synchronized(Counter.class){
              count++;
          }

          count++;
      }
  }