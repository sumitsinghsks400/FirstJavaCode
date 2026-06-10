package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxMinArr13 {
    public static void main(String[] args) {
        int arr[] = {2,7,8,9,0,5,23};
        int max= Arrays.stream(arr).boxed().max((a, b)->a>b?1:-1).get();
        int max1=Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
        int max2=Arrays.stream(arr).boxed().max(Comparator.comparing(Integer::intValue)).get();

        int max7=arr[0];
        for(int i=0;i<arr.length;i++) {

            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    max7=arr[i];
                }
            }
        }
        System.out.println("==="+max);
        System.out.println(max);
    }


}
