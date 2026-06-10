package JavaInterviewQ;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverse3 {
    public static void main(String[] args) {
        String str = "TestReverse";

        char[] s= str.toCharArray();
         String reverse="";

        for(int i=s.length-1;i>0;i--) {
            reverse+=s[i];

        }
      //  System.out.println(reverse);

        StringBuffer sb= new StringBuffer();

       Stream.of(str).forEach(a->System.out.println(new StringBuffer(a).reverse()));
       System.out.println("--------xxxxxxxxxxxxxxxxvvxcvf----");
         StringBuilder  strRev= new StringBuilder();
         for(char i: s ){
          strRev.append(i);
      }
    System.out.println(new StringBuffer(strRev).reverse());
     /*   char[] s1= str.toCharArray();
        Character[] ch= new Character[s1.length];

         Arrays.asList(ch).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);*/

     System.out.println("----------------");



System.out.println("---------------uuuuuuuuuuuuuuuu");
//Two Ponter aproch
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));

        System.out.println("-----------ssssss-");



        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Step 2: Pop and build reversed string
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());



    }
        System.out.println(reversed.toString());

        System.out.println("stackssssssssssssssssssssss");

    String result = reverse(str);

        System.out.println(result);

        String java8 = "sfdggdfjhgfhjf";

        String reverseds = java8.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            StringBuilder sbs = new StringBuilder();
                            list.forEach(sbs::append);
                            return sbs.toString();
                        }
                ));

        System.out.println(reverseds);
        System.out.println("hhhhhhhhhhhhhhhhhhhhh");
        String rev= "xsbxnbsc";
      List<Character> revers= rev.chars().mapToObj(a->(char)a).collect(Collectors.toList());

      Collections.reverse(revers);
      System.out.println(revers);

      System.out.println("-----------------------------------------------");

      String reverses="dfgafs";
       char ch[]= reverses.toCharArray();


        char[] sssss = IntStream.range(0, ch.length)
                .mapToObj(i -> ch[ch.length - 1 - i])
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString()
                .toCharArray();

        System.out.println(sssss);

        String collect = Stream.of(s).map(String -> new StringBuilder(Arrays.toString(String)).reverse()).collect(Collectors.joining(",","[","]"));
        System.out.println(collect);

    }


public static String reverse(String str) {

    // Base case
    if (str == null || str.length() <= 1) {
        return str;
    }

    // Recursive case
    return reverse(str.substring(1)) + str.charAt(0);


}

}
