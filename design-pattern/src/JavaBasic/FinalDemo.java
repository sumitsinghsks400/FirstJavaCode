package JavaBasic;

public class FinalDemo  extends  FinalTest{
    public static void main(String[] args) {
      /*  FinalTest finalTest= new FinalTest();
        finalTest.show();*/
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.show();
    }
}
 class FinalTest {
     private final   String name = "sumit";

    /* FinalTest(String name) {
         this.name = name;
     }*/
      final  void show(){

          System.out.println(name);
      }
 }