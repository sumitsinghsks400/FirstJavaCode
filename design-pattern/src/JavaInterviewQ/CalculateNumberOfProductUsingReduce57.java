package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;

public class CalculateNumberOfProductUsingReduce57 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//44. Calculate the Product of All Numbers
//Question: Calculate the product of all numbers in a list using reduce.
       int num= numbers.stream().reduce((a,b)->a*b).orElseThrow();
       System.out.println(num);


    }
}
