package StringDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayShifiting {
    public static void main(String[] args) {
        int arr[]= {0,1,0,0,0,1};
        int  left=0;
        for(int i=0;i<arr.length;i++) {
            System.out.println(left);

             if(arr[i] ==0) {
                 int temp= arr[i];
                 arr[i] = arr[left];
                 arr[left]= temp;
                 left++;
                System.out.println(temp);
                // System.out.println(Arrays.toString(arr));
             }

        }
        System.out.println(Arrays.toString(arr));
    }
}
