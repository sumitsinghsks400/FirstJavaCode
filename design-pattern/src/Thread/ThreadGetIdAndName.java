package Thread;

public class ThreadGetIdAndName {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread= Thread.currentThread();
        System.out.println(mainThread.threadId());
        System.out.println(mainThread.getName());
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t3.setName("myThread");

        System.out.println("Thread 1 id is:" + t1.threadId() + " name :" + t1.getName());
        System.out.println("Thread 2 id is:" + t2.getId() + " name :" + t2.getName());
        System.out.println("Thread 3 id is:" + t3.threadId() + " name :" + t3.getName());

        long startTime = System.currentTimeMillis();

        for(int i=0; i<5; i++) {
            System.out.println("Hello from main Method : " + i);
            Thread.sleep(1000);

        }
        long endTime=System.currentTimeMillis();
        System.out.println("Total Time Taken " + (endTime-startTime));

    }
}
