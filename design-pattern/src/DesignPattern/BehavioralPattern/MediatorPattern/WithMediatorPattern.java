package DesignPattern.BehavioralPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

interface  ChatMediator {
    void sendMessage(String message, Users user);

    void adduser(Users user);

}

class ChatRoom  implements ChatMediator{
    private List<Users> users;

  public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Users user) {
        for(Users user1: users) {
            if(user != user1) {
                user1.reciveMessage(message, user);
            }
        }
    }

    @Override
    public void adduser(Users user) {
        users.add(user);

    }
}

class Users {
private  String name;
private ChatMediator chatMediator;

    public Users(String name,ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator=chatMediator;
    }
public  void  sendMessage(String msg) {
        System.out.println(this.name + "sending a msg " + msg);
        chatMediator.sendMessage(msg, this);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  reciveMessage(String msg, Users sender) {
        System.out.println(this.name + " recived message : " +  "from " + sender.getName());
    }
}

public class WithMediatorPattern {
    public static void main(String[] args) {
ChatMediator chatMediator = new ChatRoom() ;
        Users rahul = new Users("rahul",chatMediator);
        Users amit = new Users("AMIT",chatMediator);
        Users neha = new Users("Neha",chatMediator);
        chatMediator.adduser(rahul);
        chatMediator.adduser(amit);
        chatMediator.adduser(neha);
        amit.sendMessage("Hi everyone");



    }
}
