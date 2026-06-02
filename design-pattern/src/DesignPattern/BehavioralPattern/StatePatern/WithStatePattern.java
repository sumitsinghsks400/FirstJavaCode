package DesignPattern.BehavioralPattern.StatePatern;
 interface TransportationMode {
     int calculateEta();
     String getDirection();
 }
 class Walking implements TransportationMode{

     @Override
     public int calculateEta() {
         System.out.println("calculate eta walking");
         return 10;
     }

     @Override
     public String getDirection() {
         return "Diretion for walking";
     }
 }

class Car implements TransportationMode{

    @Override
    public int calculateEta() {
        System.out.println("calculate eta car");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Diretion for walking";
    }
}
class DirectionService1 {
     private  TransportationMode transportationMode;
      public void DirectionService(TransportationMode transportationMode ) {
          this.transportationMode=transportationMode;
      }
      public void  setTransportationMode(TransportationMode transportationMode) {
          this.transportationMode=transportationMode;
      }
      // delegating the work current state's Concert class
    public int getEta(){
          return transportationMode.calculateEta();
    }

    public  String getDiraction() {

        return transportationMode.getDirection();
    }

}

public class WithStatePattern {
    public static void main(String[] args) {

        DirectionService1 directionService1 =new DirectionService1();

        directionService1.setTransportationMode(new Car());

        directionService1.getEta();

    }
}
