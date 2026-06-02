package DesignPattern.BehavioralPattern.StatePatern;

enum TransportMode {
    WALKING,CYCLING,CAR,TRAIN

}

class DirectionService{
    private  TransportMode transportMode;

    public  DirectionService(TransportMode transportMode){
        this.transportMode=transportMode;
    }

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    //Methode to calculate   upon transportation

    public int getEta() throws IllegalAccessException {
        switch (transportMode) {
            case CAR -> {
                System.out.println("calculate eta for  car");
                return 10;
            }
            case WALKING -> {
                System.out.println("calculate eta for  Walking");
                return 60;
            }
            case CYCLING -> {
                System.out.println("calculate eta for  Cycling");
                return 50;
            }
            case TRAIN -> {
                System.out.println("calculate eta for  train");
                return 30;
            }
            default -> throw new IllegalAccessException("unknow Mode");
        }
    }

    public String getDirection() throws IllegalAccessException {
        switch (transportMode) {
            case CAR -> {
                return "Direction for car :use 50 two words downtown";
            }
            case WALKING -> {
                return "Direction for walking :use 50 two words downtown";
            }
            case CYCLING -> {
                return "Direction for cycling :use 50 two words downtown";
            }
            case TRAIN -> {

                return "Direction for train :use 50 two words downtown";
            }
            default -> throw new IllegalAccessException("no direction");
        }
    }
}
public class WithoutStatePattern {
    public static void main(String[] args) throws IllegalAccessException {

        DirectionService directionService = new DirectionService(TransportMode.CAR);
        directionService.setTransportMode(TransportMode.CYCLING);

        System.out.println(  directionService.getDirection());
        directionService.getEta();


    }
}
