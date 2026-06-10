package Thread;

public class ThreadJoin {
 static int i=0; //  instantan variable
    public static void main(String[] args) throws InterruptedException {
       // System.out.println("main method start");
      //  final int[] i = {0};  //we can not  use local variable in lemenda  but if want to use local variable then  use in final key work
        Thread t= new Thread(()-> {

            while (i< 5) {
                System.out.println("thread start t" + i);
                i++;
            }
        }
        );
         Runnable runnable= ()-> {
            System.out.println("RunableInterface");
         };
        Thread thread  =  new  Thread(runnable);

         t.start();
         t.join();
    //    System.out.println("main method start");

        thread.start();
        thread.join();
        System.out.println("main method start");


//        thread.join();
//        ThreadTest th = new ThreadTest(8);
//
//        ThreadTestRunnable tr= new ThreadTestRunnable();
//        Thread th1= new Thread(tr);
//        th1.start();
//
//        th.start();
//        th.join();
//
//        System.out.println("main method start");


    }
}
 class ThreadTest extends  Thread{
    int i =2;
    ThreadTest(int i){
        this.i=i;
    }
     @Override
     public void run() {
         System.out.println("test  extend  :-" +  i);
     }

 }

class ThreadTestRunnable implements   Runnable{

    @Override
    public void run() {
        System.out.println("Runable Test");
    }
}