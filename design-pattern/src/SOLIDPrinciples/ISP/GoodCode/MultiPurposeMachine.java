package SOLIDPrinciples.ISP.GoodCode;

import SOLIDPrinciples.ISP.BadCode.Documents;
import SOLIDPrinciples.ISP.BadCode.Machine;

public class MultiPurposeMachine implements Printer,Scanner,Copier {

    @Override
    public void print(Documents doc) {
        System.out.println("printing Document ");
    }

    @Override
    public void scan(Documents doc) {
        System.out.println("Scan Document ");
    }

    @Override
    public void copy(Documents doc) {
        System.out.println("Copy Document ");

    }
}
