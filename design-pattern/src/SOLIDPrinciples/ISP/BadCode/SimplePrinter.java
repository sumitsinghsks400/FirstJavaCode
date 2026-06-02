package SOLIDPrinciples.ISP.BadCode;

import javax.swing.text.Document;
// might be not using  cop ()
public class SimplePrinter implements Machine{
    @Override
    public void print(Documents doc) {
        System.out.println("printing Document ");
    }

    @Override
    public void scan(Documents doc) {
        System.out.println("printing Document not supported ");

    }

    @Override
    public void copy(Documents doc) {
        System.out.println("printing Document not supported ");

    }
}
