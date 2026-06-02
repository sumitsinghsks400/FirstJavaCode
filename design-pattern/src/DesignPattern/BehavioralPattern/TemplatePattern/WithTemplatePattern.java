package DesignPattern.BehavioralPattern.TemplatePattern;

abstract  class DataParser{
    // Template Methode  Defind Steps of the algorithm

    public final void parse(){
        openFile1();
        parseData();
        closeFile1();
    }
    private  void  openFile1(){
        System.out.println("opening file");
    }

    private void  closeFile1(){
        System.out.println("closing file");
    }
    protected  abstract void parseData();
}
// csv parser
class CsvParser1 extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing csv data");
    }
}

class JsonParser1 extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing Json data");
    }
}


public class WithTemplatePattern {
    public static void main(String[] args) {
         CsvParser1 csvParser1 = new CsvParser1();

         JsonParser1 jsonParser1 = new JsonParser1();

         csvParser1.parse();
         jsonParser1.parse();

    }
}
