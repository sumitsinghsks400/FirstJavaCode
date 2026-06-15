package JavaInterviewQ;

import java.util.Arrays;

public class ConacateAllStringIntoSingleString29 {
    public static void main(String[] args) {
        //Concatenate all strings in a list into a single string.

       // Arrays.asList("sumit","mohan","rohan","sohan","mohan","raja").stream().map(a->new StringBuffer().append(a)).forEach(System.out::print);

        String s =Arrays.asList("sumit","mohan","rohan","sohan","mohan","raja").stream().reduce("" ,(a,b)->a +" " +b);

        System.out.println(s);
    }
}
