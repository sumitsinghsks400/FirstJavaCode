package SOLIDPrinciples.ISP.BadCode;

import javax.swing.text.Document;

public interface Machine {
    void print(Documents doc);
    void scan(Documents doc);
    void copy(Documents doc);

}
