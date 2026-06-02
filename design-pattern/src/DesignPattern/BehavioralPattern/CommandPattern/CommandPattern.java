package DesignPattern.BehavioralPattern.CommandPattern;
 interface Command {
     void execute();

 }
 class BoldCommand implements  Command {
     private TextEditor1 editor;

     public BoldCommand(TextEditor1 textEditor1) {
         this.editor=textEditor1;
     }

     @Override
     public void execute() {
         editor.boldText();
     }
 }

class ChangColor implements  Command {
    private TextEditor1 editor;

    public ChangColor(TextEditor1 textEditor1) {
        this.editor=textEditor1;
    }

    @Override
    public void execute() {
        editor.changeColor();
    }
}

 //Button class logic
class Button {
     private Command command;


     public void setCommand(Command command) {
         this.command = command;
     }

     public  void click() {
         command.execute();
     }
 }


class TextEditor1 {
    public  void boldText() {
        System.out.println("Text has been bolded");
    }
    public  void italicizeText() {
        System.out.println("Text has been italicizeText");
    }
    public  void underLineText() {
        System.out.println("Text has been italicizeText");
    }
    public void changeColor(){
        System.out.println("Text Color has been changed");
    }
}
public class CommandPattern {
    public static void main(String[] args) {
        TextEditor1 textEditor = new TextEditor1();

        Button button= new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.setCommand(new ChangColor(textEditor));
        button.click();
    }
}
