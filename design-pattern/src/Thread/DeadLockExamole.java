package Thread;

public class DeadLockExamole {
    public static final String R1="hello";
    public static final String R2="hi";
    public static void main(String[] args) {
        Thread thread1= new Thread(()-> {
            synchronized (R1) {
             System.out.println("Thread T1 locked :Ressource R1");
                synchronized (R2) {
                    System.out.println("Thread T1 locked :Ressource R2");
                }
            }
        });
// this is deadlock  setuation
//        Thread thread2= new Thread(()-> {
//            synchronized (R2) {
//                System.out.println("Thread T2 locked :Ressource R2");
//                synchronized (R1) {
//                    System.out.println("Thread T2 locked :Ressource R1");
//                }
//            }
//        });
// deadlock issue fix to avoid circulater dependency
        Thread thread2= new Thread(()-> {
            synchronized (R1) {
                System.out.println("Thread T2 locked :Ressource R2");
                synchronized (R2) {
                    System.out.println("Thread T2 locked :Ressource R1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
 class DeadLockDemo {
    public static final String R1="hello";
     public static final String R2="hi";


 }