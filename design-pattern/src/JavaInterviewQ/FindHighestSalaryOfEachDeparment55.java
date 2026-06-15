package JavaInterviewQ;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighestSalaryOfEachDeparment55 {
    public static void main(String[] args) {
        //42. Find Employees with Highest Salary in Each Department
        //Question: From a list of employees, find the highest-paid employee in each
        //department.

        List<Emp> employees = Arrays.asList(
                new Emp("Alice", "HR", 50000),
                new Emp("Bob", "IT", 80000),
                new Emp("Charlie", "IT", 75000),
                new Emp("Dave", "HR", 60000),
                new Emp("Eve", "Finance", 70000)
        );

        Map<String, Emp> highestPaid =  employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)), Optional::get)));
        System.out.println(highestPaid);

    }
}
class Emp {
    String name, department;
    double salary;
    Emp(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
