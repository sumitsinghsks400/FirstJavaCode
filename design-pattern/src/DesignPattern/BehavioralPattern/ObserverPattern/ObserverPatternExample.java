package DesignPattern.BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface  Observer {
   void update(float temp);
}

// subject Interface
  interface  Subject {
   void attach(Observer obs);
   void  detach(Observer obs);
   void  notifyObserver();

}

class WeatherStationIn implements  Subject {
   private float temp;

   private List<Observer> observersList;
   public WeatherStationIn(){
      observersList = new ArrayList<>();
   }

   public void setTemp(float temp) {
      this.temp=temp;
      notifyObserver();
   }

   @Override
   public void attach(Observer obs) {

      observersList.add(obs);

   }

   @Override
   public void detach(Observer obs) {
    observersList.remove(obs);
   }

   @Override
   public void notifyObserver() {
  for(Observer obs: observersList) {
     obs.update(temp); //run time pollymerPhysm
  }
   }
}

class  DisplayDeviceIn implements Observer {

   String name;
   public  DisplayDeviceIn(String deviceName) {
      this.name=deviceName;
   }
   @Override
   public void update(float temp) {
      System.out.println( "Temp on Display is:" + name+ " " +temp);
   }
}

class MobileDevice implements  Observer {

   @Override
   public void update(float temp) {
  System.out.println( "Temp on Display is:" + temp);
   }
}
public class ObserverPatternExample {
   public static void main(String[] args) {
      WeatherStationIn weatherStationIn= new WeatherStationIn();

      //Create Suscriber

      DisplayDeviceIn device = new DisplayDeviceIn("Samsung");

      MobileDevice mobileDevice = new MobileDevice();

      weatherStationIn.attach(device);
      weatherStationIn.attach(mobileDevice);


      // set temp

      weatherStationIn.setTemp(26);
       //Detach
       weatherStationIn.detach(mobileDevice);
       weatherStationIn.setTemp(27);



   }
}
