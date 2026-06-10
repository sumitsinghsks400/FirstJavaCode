package JavaInterviewQ;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CoomanQuestionAskInterview17 {
    public static void main(String[] args) {


       boolean b= Arrays.asList("java", "Stream Api", "lamda").stream().anyMatch(s->s.contains("api"));

       int arr[]={1,2,3,4,2,5,1};
       //remove deblicate
       Arrays.stream(arr).boxed().distinct().forEach(System.out::println);
System.out.println("---");
       // finfDublicate
         Set<Integer> unique = new HashSet<>();

        Arrays.stream(arr).boxed().filter(a->!unique.add(a)).collect(Collectors.toSet()).stream().forEach(System.out::println);

        // crouping by Length
        System.out.println("crouping by Length");
        Arrays.asList("java", "Stream Api", "lamda").stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().forEach(System.out::println);

        //FlatingList
        Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8,9)).stream().flatMap(List::stream).forEach(System.out::println);

        //CONCARENT String

      String list=Arrays.asList("java", "Stream Api", "lamda").stream().reduce("",(s1, s2)->s1 + "" + s2).trim();

      //LomgestString

        Arrays.asList("sumit","namits","Java","phyton").stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).stream().forEach(System.out::println);
      //Creat Cutom Collecter
       String joins= Arrays.asList("sumit","namits","Java","phyton").stream().collect(Collectors.joining(", "));
       System.out.println(joins);

       // null pont

        Arrays.asList("sumit","namits","Java","phyton",null).stream().filter(Objects::nonNull).forEach(System.out::println);
        //Average Value
      Double average=  Arrays.asList(2,4,5,6,7,8,54,4).stream().mapToInt(Integer::intValue).average().orElse(0.0);
      System.out.println(average);

        //List of String in Map

        Arrays.asList("sumit","namits","Java","phyton").stream().collect(Collectors.toMap(word->word,String::length)).entrySet().stream().forEach(System.out::println);

// Partitio number Even and odd
        System.out.println("Even Odd");
        Arrays.asList(1,2,3,4,5,6,3,5).stream().collect(Collectors.partitioningBy(n->n%2==0)).entrySet().forEach(System.out::println);

        Arrays.asList(1,2,3,4,5,6,3,5).stream().collect(Collectors.partitioningBy(n->n%2==0)).entrySet().stream().filter(a->a.getKey().equals(false)).forEach(System.out::println);






    }
}
