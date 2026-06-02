package CollectsDemo.ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3);
       // addTenDoller(arrayList);
       // Collections.unmodifiableList(arrayList);
       // addTenDoller(Collections.unmodifiableList(arrayList));
        //List.of(arrayList);
      List<Integer> immutableList=  List.of(123,3456,7556,444); //java 9
      var immutableLists= new ArrayList<Integer>(immutableList);
        addTenDoller(immutableList);
    }
    private  static List<Integer> addTenDoller(List<Integer> accountNums) {
        accountNums.add(56);// to avod  using  immutable list
        for (Integer account : accountNums) {
            System.out.println("10 doller created account " + account);
        }
        return accountNums;
    }
}
