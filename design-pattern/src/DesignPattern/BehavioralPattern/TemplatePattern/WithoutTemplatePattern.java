package DesignPattern.BehavioralPattern.TemplatePattern;

class CsvParser{
    public  void parse(){
        openFile();
          //csv Specific Parsing logic

        System.out.println("Parsing a csv file");
        closeFile();
    }

    private  void  openFile(){
        System.out.println("opening file");
    }

    private void  closeFile(){
        System.out.println("closing file");
    }
}

class JsonParser{
    public  void parse(){
        openFile();
        //csv Specific Parsing logic

        System.out.println("Parsing a json file");
        closeFile();
    }

    private  void  openFile(){
        System.out.println("opening file");
    }

    private void  closeFile(){
        System.out.println("closing file");
    }
}

public class WithoutTemplatePattern {
    public static void main(String[] args) {
        CsvParser csvParser = new CsvParser();
        csvParser.parse();
        JsonParser jsonParser= new JsonParser();
        jsonParser.parse();

    }
}
