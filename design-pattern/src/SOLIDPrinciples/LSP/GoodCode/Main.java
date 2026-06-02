package SOLIDPrinciples.LSP.GoodCode;

public class Main {
    public  static void readAnyFile(ReadableFile file) {
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readableFile= new ReadOnlyFile();
        readableFile.read();


        WritableFile  writableFile = new WritableFile();
        writableFile.write();
        writableFile.read();
        readAnyFile(readableFile);
        readAnyFile(writableFile);

    }
}
