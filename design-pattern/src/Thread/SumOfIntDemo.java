package Thread;

public class SumOfIntDemo {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        long result = 0;
        for(long i=0;i<=Integer.MAX_VALUE;i++) {
            result=result+i;

        }
        System.out.println(result);
        long endTime=System.currentTimeMillis();
        System.out.println("Total Time taken by normal java class is :" + (endTime-startTime));
    }
}
