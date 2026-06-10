package JavaInterviewQ;

import java.util.Arrays;

public class ArrayLeftrightShift5 {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,0};
        int left =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                int temp =arr[i];
                arr[i]=arr[left];

                arr[left]=temp;
                left ++;
                System.out.println("--" + Arrays.toString(arr));
            }
        }
     //   System.out.println(Arrays.toString(arr).toString());
    }
}
