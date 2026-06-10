package PracticJava;

public class MrmberinnerclassDemo {
    int age = 20;

    class Bank {
        int Balance = 2000;


        public int getBalance() {
            return Balance;
        }

    }

    public static void main(String[] args) {
        MrmberinnerclassDemo obj = new MrmberinnerclassDemo();
        Bank bank = obj.new Bank();
        System.out.println(bank.getBalance());
        System.out.println(obj.age);
    }
}