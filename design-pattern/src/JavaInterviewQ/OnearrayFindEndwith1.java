package JavaInterviewQ;

import java.util.Arrays;

public class OnearrayFindEndwith1 {
    public static void main(String[] args) {
        int arr[] = {55,66,77,88,99};
        Arrays.stream(arr).mapToObj(a->a +"").filter(b->b.endsWith("6")).forEach(System.out::println);
    }
}

