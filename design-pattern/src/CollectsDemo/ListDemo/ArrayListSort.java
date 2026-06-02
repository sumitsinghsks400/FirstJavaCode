package CollectsDemo.ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(-90);
        arrayList.add(-5);

//        arrayList.add(null);
//        arrayList.add(null);

//        arrayList.add(3,8);
//        arrayList.set(4,9);
//        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

        //Collections.sort(arrayList.reversed());

//        Collections.sort(arrayList, Comparator.reverseOrder());
//        System.out.println(arrayList);

        var countery= new ArrayList<String>();
        countery.add("india");
        countery.add("japan");
        countery.add("iiran");
        countery.add("pakistan");
        System.out.println(countery);
        Collections.sort(countery);
        countery.sort(Comparator.reverseOrder());
        System.out.println(countery);

        //Collections.sort(arrayList.reversed());

        Collections.sort(countery, Comparator.reverseOrder());
        System.out.println(countery);

    }
}
