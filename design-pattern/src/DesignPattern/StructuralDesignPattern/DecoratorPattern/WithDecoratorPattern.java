package DesignPattern.StructuralDesignPattern.DecoratorPattern;

interface Pizza1 {
    String getDescriptionOfPiza ();
    double getPrice();
}

class BasicPizza1 implements Pizza1 {

    @Override
    public String getDescriptionOfPiza() {
        return "Basic Pizza";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}

abstract class PizzaDecoraterClass implements Pizza1 {
protected  Pizza1 decoratedPizza;
public PizzaDecoraterClass (Pizza1 pizza){
    this.decoratedPizza=pizza;
}
    @Override
    public String getDescriptionOfPiza() {
        return decoratedPizza.getDescriptionOfPiza();
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice();
    }
}

class CheesDecorater  extends  PizzaDecoraterClass {

    public CheesDecorater(Pizza1 pizza) {
        super(pizza);
    }

    @Override
    public String getDescriptionOfPiza() {
        return super.getDescriptionOfPiza() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() +  1.22;
    }
}

class OlivateDecorator  extends  PizzaDecoraterClass {
    public OlivateDecorator(Pizza1 pizza) {
        super(pizza);
    }

    @Override
    public String getDescriptionOfPiza() {
        return super.getDescriptionOfPiza() +  "oli Decorator";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.333;
    }
}


public class WithDecoratorPattern {
    public static void main(String[] args) {
  //BasicPizz

        Pizza1 pizza1= new BasicPizza1();
        pizza1 = new CheesDecorater(pizza1);

        pizza1= new  OlivateDecorator(pizza1);
        System.out.println(pizza1.getDescriptionOfPiza());

    }
}
