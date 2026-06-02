package SOLIDPrinciples.LSP.badCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();//working fine
        file.write();//throwing exception
    }
}
