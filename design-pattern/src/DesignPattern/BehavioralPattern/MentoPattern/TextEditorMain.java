package DesignPattern.BehavioralPattern.MentoPattern;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Caretaker  caretaker= new Caretaker();//History /StateMangment

        editor.write("hello word!");
        caretaker.saveState(editor);
        editor.write("hello  EveryOne!");
        caretaker.saveState(editor);
        editor.write("hello  Every!");
        caretaker.saveState(editor);
        // Problem -> Undo the last write!
        caretaker.undo(editor);
        caretaker.undo(editor);
        System.out.println(editor.getContent());
    }

}
