package DesignPattern.CreationalPattern.BuilderDesinPattern;

class Houses {
    private  String foundation;

    private String Structure;

    private  String roof;

    private  boolean hasGarage;

    private  boolean hasSwimmingPool;

    private  boolean hasGarden;



    public Houses(HousesBuilder builder) {
        this.foundation = builder.foundation;
        this.Structure = builder.Structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = false;
        this.hasGarden = builder.hasGarden;
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
    public static class HousesBuilder{
        private  String foundation;

        private String Structure;

        private  String roof;

        private  boolean hasGarage;

        private  boolean hasSwimmingPool;

        private  boolean hasGarden;

        //Builder Constructor  with MandatoryParameter


        public HousesBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            Structure = structure;
            this.roof = roof;
        }
        //optionalParameter
        public HousesBuilder setGerden(boolean hasGarage) {
            this.hasGarage=hasGarage;
            return this;
        }

        public  HousesBuilder setSwingingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool=hasSwimmingPool;
            return this;
        }
        public HousesBuilder setGarage(boolean hasGarden){
            this.hasGarage=hasGarage;
            return  this;
        }

        public  Houses build() {
            return  new Houses(this);
        }
    }
}

public class WithBuilderDesignPattern {
    public static void main(String[] args) {
        Houses houses= new Houses.HousesBuilder("Concrete","wood","title")
                .setGerden(true)
                .setGarage(false).build();

        System.out.println(houses);
    }
}
