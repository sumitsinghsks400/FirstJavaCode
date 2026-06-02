package CollectsDemo.ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomCClassSorting {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("sumit",34,45));
        students.add(new Student("Namit",36,47));
        students.add(new Student("Puja",32,44));
        System.out.println(students);
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.rollNumber>o2.rollNumber?1:-1;
//            }
//        });

        Collections.sort(students);

        System.out.println(students);
    }
}
 class Student implements Comparable<Student>{// comprator also impliment  just pass  in compare Methode to object
    String name;
    int  rollNumber;
    int marks;

     public Student(String name, int rollNumber, int marks) {
         this.name = name;
         this.rollNumber = rollNumber;
         this.marks = marks;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", rollNumber=" + rollNumber +
                 ", marks=" + marks +
                 '}';
     }



     @Override
     public int compareTo(Student o) {
    
         return Integer.compare(this.marks,o.marks);
     }
 }