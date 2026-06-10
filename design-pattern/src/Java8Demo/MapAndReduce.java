package Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduce {
    public static void main(String[] args) {
        //sum of value
       Integer s= Stream.of(2,3,4,5,4,5,6,4).reduce(0,(a,b)->a+b);
     //  System.out.println(s);

       List<Integer>  number=Arrays.asList(3,5,4,7,8,4,6,4,5,9);
        int sum = number.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        number.stream().mapToInt(Integer::intValue).forEach(System.out::println);
        number.stream().reduce(Integer::sum).stream().forEach(System.out::println);
        number.stream().reduce(Integer::max).stream().forEach(System.out::println);

      int mul=  number.stream().reduce(1,(a,b)->a*b);
      System.out.println(mul);

      // maxm Length
        Arrays.asList("sumit","namit","hsjdhjsd").stream().reduce((word1,word2)-> word1.length()>word2.length()?word1:word2).stream().forEach(System.out::println);

    }
}
