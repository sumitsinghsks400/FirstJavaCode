package JavaInterviewQ;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRelated15 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(1,"sumit","101",1001,"Active"));
        arrayList.add(new Employee(2,"namit","102",1002,"InAcative"));
        arrayList.add(new Employee(3,"ram","101",1003,"Active"));
        arrayList.add(new Employee(4,"Shyam","105",1005,"InActive"));
        arrayList.add(new Employee(6,"raju","105",1004,"Active"));
        arrayList.add(new Employee(5,"ratnesh","106",1007,"InActive"));
        arrayList.add(new Employee(7,"mohan","106",1006,"Active"));
        Map<String, Long> collecta=	arrayList.parallelStream().collect(Collectors.groupingBy(Employee::getDepartMent,Collectors.counting()));
        System.out.println(collecta);


        Map<String, Integer> collect6 = arrayList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        System.out.println("------------"+collect6);

        TreeSet<String> collect7 = arrayList.stream().map(e->e.name).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("collect7-----" +collect7);
        //arrayList.forEach(a->System.out.println(a));
        Map<String, Long> collect = arrayList.stream().collect(Collectors.groupingBy(Employee::getDepartMent,Collectors.counting()));
        System.out.println(collect);
        System.out.println("==============");
        Map<String, Integer> collect2 = arrayList.stream().collect(Collectors.groupingBy(Employee::getDepartMent,Collectors.summingInt(Employee::getSalary)));

        System.out.println(collect2);

        Map<Boolean, List<Employee>> collect3 = arrayList.stream().collect(Collectors.groupingBy(e->e.getStatus().equals("Active")));
        List<String> collect4 = collect3.get(false).stream().map(e->e.getId()+e.getName()).collect(Collectors.toList());
        System.out.println(collect4);

        Optional<Employee> max = arrayList.stream().max(Comparator.comparing(Employee::getDepartMent));
        System.out.println(max.get().getName());

        Optional<Employee> findFirst = arrayList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(findFirst);
        String collect5 = arrayList.stream().map(emp->emp.getName()).collect(Collectors.joining(",","[","]"));
        System.out.println(collect5);

        //Sum 0f salarly

        //arrayList.stream().mapToInt(e->e.salary).sum();

    }

}


class  Employee {
    int id;
    String name;
    String departMent;
    int salary;
    String status;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartMent() {
        return departMent;
    }
    public void setDepartMent(String departMent) {
        this.departMent = departMent;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Employee(int id, String name, String departMent, int salary, String status) {
        super();
        this.id = id;
        this.name = name;
        this.departMent = departMent;
        this.salary = salary;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", departMent=" + departMent + ", salary=" + salary
                + ", status=" + status + "]";
    }



}