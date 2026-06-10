package PracticJava;


public class CustomArray {

    public static void main(String[] args) {

        int[] arr = new int[100];
        char[] carr = new char[10];
        Student[] sarr = new Student[20];

        Object[] newarr = new Object[1000];

        newarr[0] = new Student();
        newarr[1] = new Student();
        newarr[2] = new Customer();
        newarr[3] = Integer.valueOf(10);

        System.out.println("Objects stored successfully");
    }
}

class Student {
    String name;
    int roll;

    // Example method
    void sort(Student[] arr) {
        // sorting logic
    }
}

class Customer {
    String name;
    int roll;
}