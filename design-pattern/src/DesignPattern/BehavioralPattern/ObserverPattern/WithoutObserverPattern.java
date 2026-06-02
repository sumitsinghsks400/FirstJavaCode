package DesignPattern.BehavioralPattern.ObserverPattern;
class DisplayDevice {
    public void showTemp(float temp) {
        System.out.println("Current temp: " + temp + "C");
    }
}

class WeatherStation{
    private float tempreture;
    private  DisplayDevice displayDevice; //can be mulple such device later on

    public  WeatherStation (DisplayDevice displayDevice) {
        this.displayDevice=displayDevice;

    }

    public  void setTempreture(float tempreture) {
        this.tempreture = tempreture;
         notifyDevice();
    }

    public  void notifyDevice() {
        displayDevice.showTemp(tempreture);
    }
}
public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice displayDevice= new DisplayDevice();
        WeatherStation weatherStation= new WeatherStation(displayDevice);
        weatherStation.setTempreture(26);
        weatherStation.setTempreture(27);
    }
}
