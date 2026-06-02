package CollectsDemo.ListDemo;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3);
//        arrayList.add(null);
//        arrayList.add(null);
        List<String> arrayList1= new ArrayList<>();
        arrayList.add(3,8);
        arrayList.set(4,9);
        Collections.sort(arrayList);


        var doubleNums= new ArrayList<>();

        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.reversed());
        arrayList.iterator();
 for(Integer list: arrayList) {
     System.out.println(list);
     System.out.println("-----------------");
        }

        Iterator<Integer>    list = arrayList.iterator();
        while (list.hasNext()) {
            System.out.println("--------------============");
            if(list.next().equals(3)) {
                list.remove();
            }
          //  System.out.println(list.next());
        }
        System.out.println(arrayList);

        System.out.println("ListIterator");

       ListIterator<Integer> listIterator= arrayList.listIterator();

     //  while (listIterator.hasNext()) {
           while (listIterator.hasPrevious()) {
           listIterator.hasPrevious();
           System.out.println(listIterator.next());
       }

    }
}

