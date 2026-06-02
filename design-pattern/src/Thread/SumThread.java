package Thread;

public class SumThread  extends Thread{
  private  int startIndex;
  private  int endIndex;
  private  long  result;

    public SumThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public  void  run() {

        for (long i= startIndex; i<=endIndex; i++) {
            result = result + i;
        }
    }
    public long getResult() {

        return result;
    }
}

class TestThread {
    public static void main(String[] args) throws InterruptedException {


        long startTime = System.currentTimeMillis();
        SumThread sumThread = new SumThread(0,Integer.MAX_VALUE/2);
        SumThread sumThread1 = new SumThread(Integer.MAX_VALUE/2 +1,Integer.MAX_VALUE);
        sumThread.start();
        sumThread1.start();
        sumThread.join();
        sumThread1.join();
      long result = sumThread.getResult() + sumThread1.getResult();
      System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time taken by multiple  thread java class is :" + (endTime - startTime));
    }
}
