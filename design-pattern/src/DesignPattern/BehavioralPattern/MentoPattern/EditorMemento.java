package DesignPattern.BehavioralPattern.MentoPattern;
//Memento class :Stores the internal state of the textEditor.
public class EditorMemento {
    private  final String content;


    public EditorMemento(String content) {
       this.content = content;
    }
    public  String getContent() {
        return content;
    }
}
