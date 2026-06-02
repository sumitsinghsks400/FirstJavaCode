package SOLIDPrinciples.ISP.GoodCode;

import SOLIDPrinciples.ISP.BadCode.Documents;

public class SimplePrinter implements Printer {
    @Override
    public void print(Documents doc) {
        System.out.println("Print doc");
    }
}
