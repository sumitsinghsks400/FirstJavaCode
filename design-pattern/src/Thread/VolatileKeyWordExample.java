package Thread;

public class VolatileKeyWordExample {

    public static void main(String[] args) throws InterruptedException {
        ShareBooleanResource shareBooleanResource = new ShareBooleanResource();
        Thread workerThread= new Thread(()->
                shareBooleanResource.dowork()  );


        Thread stoperThread= new Thread(()-> {
            try {
                Thread.sleep(3000);

                shareBooleanResource.setStopFlag();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        workerThread.start();

        stoperThread.start();
        workerThread.join();
        stoperThread.join();
    }
}
 class ShareBooleanResource {
    private volatile boolean stopFlag= false;

      void setStopFlag(){
          stopFlag=true;
      }

      public  void dowork() {
          while (!stopFlag) {
              System.out.println("working --");
          }
          System.out.println("Work stopped");
      }
 }