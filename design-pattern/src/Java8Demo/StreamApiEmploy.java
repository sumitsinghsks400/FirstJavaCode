package Java8Demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiEmploy {
    public static void main(String[] args) {

        ArrayList<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"sumit", 500.0,"it"));
        list.add(new Employee(4,"namit", 700.0,"je"));
        list.add(new Employee(2,"amit", 300.0,"ag"));
        list.add(new Employee(7,"puja", 900.0,"ad"));

//        Collections.sort(list, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalarly().compareTo(o2.getSalarly());
//            }
//        });
        System.out.println(list);
     //   list.sort((a,b)->b.getSalarly().compareTo(a.getSalarly()));
      //  System.out.println(list);
        list.stream().sorted(Comparator.comparing(Employee::getSalarly).reversed()).forEach(System.out::println);

//---------------------------------------- map sort
    //    list.stream().collect(Collectors.groupingBy(Employee::getSalarly, LinkedHashMap::new,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
Map<String,Integer> map= new HashMap<>();
        map.put("seven",7);
        map.put("eight",8);
        map.put("six",6);
        map.put("nine",9);
        map.put("two",2);
        map.put("three",3);
      List<Map.Entry<String,Integer>> entries= map.entrySet().stream().collect(Collectors.toList());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Collections.sort(entries,(a,b)->b.getValue().compareTo(a.getValue()));
        entries.stream().forEach(System.out::println);

        System.out.println("-----------------");

       // map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
       // Map<Employee,Integer> employeeIntegerMap= new TreeMap<>(Comparator.comparing(Employee::getId));
      //  Map<Employee,Integer> employeeIntegerMap= new TreeMap<>(Comparator.comparing(Employee::getSalarly));

//        Map<Employee,Integer> employeeIntegerMap= new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalarly().compareTo(o2.getSalarly());
//            }
//        });

        Map<Employee,Integer> employeeIntegerMap= new TreeMap<>((a,b)->a.getSalarly().compareTo(b.getSalarly()));




        employeeIntegerMap.put(new Employee(1,"sumit", 500.0,"it"),6);
        employeeIntegerMap.put(new Employee(4,"namit", 700.0,"je"),7);
        employeeIntegerMap.put(new Employee(2,"amit", 300.0,"ag"),5);
        employeeIntegerMap.put(new Employee(7,"puja", 900.0,"ad"),9);
        employeeIntegerMap.entrySet().forEach(System.out::println);

        employeeIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalarly).reversed())).forEach(System.out::println);
       // for(Map.Entry)


    }
}
 class Employee /*implements  Comparable<Employee> */{
    private  int id ;
    private  String name;
    private Double salarly;
    private  String department;

     public Employee(int id, String name, Double salarly, String department) {
         this.id = id;
         this.name = name;
         this.salarly = salarly;
         this.department = department;
     }

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public Double getSalarly() {
         return salarly;
     }

     public String getDepartment() {
         return department;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", salarly=" + salarly +
                 ", department='" + department + '\'' +
                 '}';
     }

//     @Override
//     public int compareTo(Employee o) {
//         return o.getSalarly().compareTo(this.salarly);
//     }
 }