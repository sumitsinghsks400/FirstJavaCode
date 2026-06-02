package DesignPattern.BehavioralPattern.MentoPattern;

public class TextEditor {

    private  String content;

    public  void write (String text) {
        this.content=text;
    }

    //save the current state of editor
    public  EditorMemento save() {
    return  new EditorMemento(content);
    }

    //Restore (Memento ->update the state of current content )
    public void  restore(EditorMemento mento) {
        content= mento.getContent();
    }
    public  String getContent(){
        return content;
    }

}
