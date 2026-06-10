package JavaInterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray4 {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,4,6,8};

        int reverse[]= new int[arr.length];


        for(int i= arr.length-1;i>0;i--) {
            System.out.print(arr[i]);
        }

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));
        // Two point approch
        int left=0;
        int right= arr.length-1;
        while (left<right) {
            int temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;


        }
        System.out.println(Arrays.toString(arr));
System.out.println("------------------------");

        int arrs[]={2,3,5,6,4,6,8};

       // Arrays.stream(arrs).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<Integer>  list=Arrays.stream(arrs).boxed().collect(Collectors.toList());

      //  Collections.reverse(list);

       // Collections.sort(list,(a,b)->b>a?1:-1);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
System.out.println("00000000");
//vvi
        int arrss[]={2,3,5,6,4,6,8};

        IntStream.range(0, arrss.length)
                .map(i -> arrss[arrss.length - 1 - i])
                .forEach(i -> System.out.print(i + " "));


    }
}
