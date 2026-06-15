package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployByDepartamentThenByAge50 {
    public static void main(String[] args) {
        //37.	Collect Nested Map by Grouping
        //Question: Group employees by department and then by age.
        List<Employees> employees = Arrays.asList(
                new Employees("Sumit", "IT", 28),
                new Employees("Raja", "HR", 30),
                new Employees("Manish", "Finance", 26),
                new Employees("Amit", "IT", 32),
                new Employees("Neha", "Marketing", 25)
        );

     Map<String, Map<Integer,List<String>>> group= employees.stream().collect(Collectors.groupingBy(dep-> dep.getDepartment(),
                Collectors.groupingBy(Employees::getAge,Collectors.mapping(e->e.getName(),Collectors.toList()))));

     System.out.println(group);
    }
}


class Employees {
    private String name;
    private String department;
    private int age;

    public Employees(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', age=" + age + "}";
    }
}
