package SOLIDPrinciples.LSP.badCode;

public class ReadOnlyFile  extends  File{

    public void  write(){
        throw  new UnsupportedOperationException("you canot write");
    }
}
