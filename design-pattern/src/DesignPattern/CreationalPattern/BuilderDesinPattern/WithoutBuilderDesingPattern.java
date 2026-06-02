package DesignPattern.CreationalPattern.BuilderDesinPattern;
class House {
    private  String foundation;

    private String Structure;

    private  String roof;

    private  boolean hasGarage;

    private  boolean hasSwimmingPool;

    private  boolean hasGarden;

    // constructor
    public  House (String foundation){

    }
    public  House (String roof, boolean  hasGarage){

    }

    public House(String foundation, String structure, String roof, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden) {
        this.foundation = foundation;
        Structure = structure;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = false;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", Structure='" + Structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}


public class WithoutBuilderDesingPattern {
    public static void main(String[] args) {

        House house= new House("concreate","wood","singhless",true,false,true);

        House house1= new House("concret"); // too many  constructor

 System.out.println(house);
    }
}
