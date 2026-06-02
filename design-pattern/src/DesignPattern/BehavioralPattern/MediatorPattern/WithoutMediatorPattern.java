package DesignPattern.BehavioralPattern.MediatorPattern;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seneMessage(String message, User recipient) {
        System.out.println(this.name + "sending msg to" + recipient.name);
    }
}

public class WithoutMediatorPattern {
    public static void main(String[] args) {
        User rahul = new User("rahul");
        User amit = new User("AMIT");
        User neha = new User("Neha");
         rahul.seneMessage("hello" ,amit);
        rahul.seneMessage("hello" ,neha);
    }
}
