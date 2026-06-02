package StringDemo;

public class StringAndNewKeyWordDemo {
    public static void main(String[] args) {
        String s= new String("sumit");
        String s1= new String("sumit");
        String s3="sumit";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s==s3);
        System.out.println(s.equals(s3));

        String s4= "sum" +"it";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        final String s7= "sum";
        String s8=s7 +"it";
        System.out.println(s8==s3);
        System.out.println(s8.equals(s3));

        String s5="it";
        String s6= s5+"sum";
        System.out.println(s3==s6);

        StringBuffer s9= new StringBuffer("sumit");
        StringBuffer s10= new StringBuffer("sumit");
        System.out.println(s10==s9);
        System.out.println(s10.equals(s9));
        //  System.out.println(s3==s9);
        System.out.println(s3.equals(s9));


    }
}
