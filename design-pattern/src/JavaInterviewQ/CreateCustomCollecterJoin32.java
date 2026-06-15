package JavaInterviewQ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CreateCustomCollecterJoin32 {
    public static void main(String[] args) {
      String s=  Arrays.asList("java","is","backen").stream().collect(Collectors.joining(" ,"));

      System.out.println(s);
    }
}
