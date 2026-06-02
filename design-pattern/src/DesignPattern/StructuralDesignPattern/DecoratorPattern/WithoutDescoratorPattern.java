package DesignPattern.StructuralDesignPattern.DecoratorPattern;

 interface Pizza {
    String getDescriptionOfPiza ();
    double getPrice();
}

class BasicPizza implements Pizza {

    @Override
    public String getDescriptionOfPiza() {
        return "Basic Pizza";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
 class CheesPiza extends  BasicPizza {
     @Override
     public String getDescriptionOfPiza() {
         return super.getDescriptionOfPiza() + " ,Cheeseb";
     }

     @Override
     public double getPrice() {
         return super.getPrice() + 1.00;
     }
 }

 class ChessOlivePiza  extends  CheesPiza {
     @Override
     public String getDescriptionOfPiza() {
         return super.getDescriptionOfPiza() +  " , ChessOlivePiza";
     }

     @Override
     public double getPrice() {
         return super.getPrice() + 2.6;
     }
 }
public class WithoutDescoratorPattern {
    public static void main(String[] args) {

        Pizza pizza = new CheesPiza();
        Pizza pizza1 = new ChessOlivePiza();

        System.out.println( pizza.getDescriptionOfPiza());
        System.out.println( pizza1.getDescriptionOfPiza());



    }
}
