package DesignPattern.CreationalPattern.FactoryDesignPattern;
interface  Transport {
    void deliver();
}
 class Car implements Transport{

     @Override
     public void deliver() {
         System.out.println("Deliver by Car");
     }
 }

 class Bike implements Transport {

     @Override
     public void deliver() {
         System.out.println("Deliver by bike");
     }
 }

class Bus implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by Bus");
    }
}

public class WithoutFactoryDesignPattern {
    public static void main(String[] args) {
      Transport car = new Car();
      Transport bike = new Bike();

      // add
        Transport bus= new Bus();
    }
}
