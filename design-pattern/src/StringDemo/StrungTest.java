package StringDemo;

public class StrungTest {
    public static void main(String[] args) {
        String s= "sumit";
       String s1= s.concat("kumar");
       String s3= new String("sumitkumar");
       System.out.println(s3==s1);
        System.out.println(s3.equals(s1));
        System.out.println(s);
        System.out.println(s1);

    }
}
