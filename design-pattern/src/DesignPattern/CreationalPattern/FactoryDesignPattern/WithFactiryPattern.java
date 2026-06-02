package DesignPattern.CreationalPattern.FactoryDesignPattern;

 interface Transports {
     void devileryBoy();
 }
class Cars implements  Transports{


    @Override
    public void devileryBoy() {
System.out.println("Deliver By car");
    }
}
class Bikes implements Transports{


    @Override
    public void devileryBoy() {
        System.out.println("Deliver By Bikes");
    }
}
class TransportFactory {
    public static Transports createTransport(String type) {

        switch (type) {
            case "car":
                return new Cars();

            case "bike":
                return new Bikes();

            default:
                throw new IllegalArgumentException("unused");
        }

    }
}
public class WithFactiryPattern {
    public static void main(String[] args) {
        Transports transports= TransportFactory.createTransport("car");
        transports.devileryBoy();
    }

}
