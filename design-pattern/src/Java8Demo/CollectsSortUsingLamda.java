package Java8Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectsSortUsingLamda {
    public static void main(String[] args) {
        List<Books>  books= new ArrayList<>();
        books.add(new Books("java"));
        books.add(new Books("php"));
        books.add(new Books("c++"));
        books.add(new Books("phy"));
        books.add(new Books("Dot"));
// basic
//        Collections.sort(books, new Comparator<Books>() {
//            @Override
//            public int compare(Books o1, Books o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });
       Collections.sort(books);
      //  System.out.println(books);
        //Lamda Ex
        Collections.sort(books,(o1,o2)-> o2.getName().compareTo(o1.getName()));

       // System.out.println(books);

        books.sort((o1,o2)-> o2.getName().compareTo(o1.getName()));
       // System.out.println(books);

        //Stream Collection of object

      //  Collections.sort(books);// asending Order
     //   Collections.reverse(books);

        books.stream().sorted().forEach(System.out::print);
        books.stream().sorted(Comparator.reverseOrder()).forEach(a->System.out.println(a));

    }
}

 class Books implements  Comparable<Books>{
   private  String name;

     public Books(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     @Override
     public String toString() {
         return "Books{" +
                 "name='" + name + '\'' +
                 '}';
     }

     @Override
     public int compareTo(Books o) {
         return o.getName().compareTo(this.name);
     }
 }