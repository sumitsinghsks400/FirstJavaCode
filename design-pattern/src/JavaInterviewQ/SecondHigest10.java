package JavaInterviewQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHigest10 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 3, 6, 8, 9, 2};
        Optional<Integer> v = Arrays.stream(arr).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
        System.out.println(v);
        System.out.println(SecondLargest(arr, arr.length));


    }

    private static int SecondLargest(int[] arr, int length) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr[length - 2];
    }
}
