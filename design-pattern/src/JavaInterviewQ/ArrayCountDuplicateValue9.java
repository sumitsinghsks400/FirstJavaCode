package JavaInterviewQ;

import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayCountDuplicateValue9 {
    public static void main(String[] args) {
        int arr[]={1,3,4,8,9,9,3};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
        }


        int target = 1;

        int counts = Arrays.stream(arr)
                .boxed()
                .reduce(
                        0,
                        (acc, val) -> val == target ? acc + 1 : acc,
                        Integer::sum
                );

        System.out.println(counts); // 3
             System.out.println(count);


        //remove dublicate
   Set<Integer> s= new HashSet<>();
        for(int i=0;i<arr.length;i++){


                s.add(arr[i]);


        }

        System.out.println(s);

//add

      int sum=  IntStream.range(0,arr.length).boxed().reduce(0,(a,b)->a+b);
      System.out.println(sum);

      //
        String s1= "dssffs";
        Stream<String> AA=Arrays.stream(s1.split(""));

        List<String> aa= Arrays.asList(s1.split(""));


    }
}
