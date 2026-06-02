package SOLIDPrinciples.ISP.BadCode;

import javax.swing.text.Document;

public class MultiPurposeMachine implements Machine{

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
