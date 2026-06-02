package Java8Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class MapAndFlatMapOptional {
    public static void main(String[] args) {
        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(new Customer(3,"sumit","sumit@", List.of("4545", "6578", "9876")));
        customers.add(new Customer(2,"namit","namt@", List.of("4545444", "6578444", "987689")));
        customers.add(new Customer(4,"puja","puja@", List.of("4545667", "6578777", "9876765")));

       List<String>  email= customers.stream().map(a->a.getEmail()).collect(Collectors.toList());
        customers.stream().map(a->a.getPhoneNumer()).forEach(System.out::println);
        System.out.println("----------");
       List<String>  phone= customers.stream().flatMap(a->a.getPhoneNumer().stream()).collect(Collectors.toList());
       System.out.println(phone);

       System.out.println(email);
        Customer customer  = new Customer(3,"sumit","sumitEmail", List.of("4545", "6578", "9876"));

       Optional<String> emails= Optional.of(customer.getEmail());
     /*   if(optionalS.isPresent()) {
            System.out.println(optionalS.get());
        } else {
            System.out.println("null");
        }*/
          String s = null;
        Optional<String> optional= Optional.ofNullable(s);

        System.out.println(optional.get());
        System.out.println(emails.orElse("Default"));
        System.out.println(emails.orElseThrow(()-> new RuntimeException("not fing")));

        System.out.println(emails.orElseGet(()->"default value"));



       // customers.stream().forEach(customer1 ->customer1.getEmail()).;
    }
}

class  Customer {
    private int id;
    private String name;

    private String email;
   private List<String> phoneNumer;

    public Customer(int id, String name, String email, List<String> phoneNumer) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumer = phoneNumer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhoneNumer() {
        return phoneNumer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumer=" + phoneNumer +
                '}';
    }
}