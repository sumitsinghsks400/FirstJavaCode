package StringDemo;

public class StringConstructorDemo {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d','e'};
        String s=new String(ch);

        byte[]b={97,98,99,100,101,109,90,80,93};
        String s1= new String(b);
        System.out.println(s);
        System.out.println(s1);

     final StringBuffer sbs = new StringBuffer("sumit");
       // sbs = new StringBuffer("trst");
        sbs.append("kumar");
        System.out.println(sbs);
        StringBuffer sb = new StringBuffer(sbs);
        sb.append("singh");
        System.out.println(sb);

    }
}
