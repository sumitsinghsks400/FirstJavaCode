package JavaInterviewQ;

import SOLIDPrinciples.LSP.GoodCode.Main;

import java.util.Arrays;

public class CheckAnyMatchContaintWithAPI26 {
    public static void main(String[] args) {
        //: Check if any string in a list contains “API”.
  //anyMatch() is a terminal operation that checks whether at least one element satisfies the given condition.

       boolean  value= Arrays.asList("sumit","ram","API").stream().anyMatch(a->a.contains("API"));
       System.out.println(value);


    }
}
