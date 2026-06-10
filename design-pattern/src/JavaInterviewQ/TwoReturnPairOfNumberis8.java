package JavaInterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoReturnPairOfNumberis8 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};


       Arrays.stream(arr).boxed().forEach(a->
                       Arrays.stream(arr).boxed().filter(b->a<b).filter(b-> a+b==8).forEach(b->System.out.println(b+ ","+ a)
                       )

                       );

       System.out.println("-------------");

       for(int i=0;i< arr.length;i++) {
           for(int j=i+1;j<arr.length;j++) {
               if(arr[i]+arr[j]==8){
                   System.out.println(arr[i] + "-" + arr[j]);

               }
           }
       }
 System.out.println("---------------------------------------------");
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = 8 - num;

            if (seen.contains(complement)) {
                System.out.println(complement + ", " + num);
            }

            seen.add(num);
        }


    }}