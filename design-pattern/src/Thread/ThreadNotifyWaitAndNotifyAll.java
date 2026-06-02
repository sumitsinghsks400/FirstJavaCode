package Thread;

import java.util.concurrent.SynchronousQueue;

public class ThreadNotifyWaitAndNotifyAll {
    public static void main(String[] args) {
        ShareResource shareResource= new ShareResource();
        Thread produser = new Thread(
                ()-> {
                    for(int i=0;i<=5;i++) {
                        shareResource.produce(i);
                        try {
                            Thread.sleep(1000);
                        }catch (InterruptedException e) {
                            throw  new RuntimeException(e);
                        }
                    }
                }
        );
        produser.start();

        Thread consumer = new Thread(
                ()-> {
                    for(int i=0;i<=5;i++) {
                        shareResource.consumer();
                        try {
                            Thread.sleep(1000);
                        }catch (InterruptedException e) {
                            throw  new RuntimeException(e);
                        }
                    }
                }
        );
        consumer.start();
    }
}
 class ShareResource {
    private  int data;
    private boolean isEmpty= true;
     synchronized  void  produce(int value) {
         while(!isEmpty) {
             try {
                 //Buffer is not empty wait for the Consumer to consume
                 wait();

             }catch (InterruptedException e) {
                 e.printStackTrace();


             }
         }
         //Producer an itm
         data = value;
         isEmpty=false;
         System.out.println("Producer : "+ value);
         // Notify the wait consumer
         notify();
     }

     synchronized  int consumer(){
         while (isEmpty) {
             try {
                 //buffer is empty wait for producer to produce
                 wait();
             }catch (InterruptedException e){
                 e.printStackTrace();

             }
         }
         //Consume the itm
         int consumeData= data;
         isEmpty=true;
         System.out.println("consumer "+ consumeData);


         //Notify the waiting producer
         notify();
         return consumeData;
     }

 }