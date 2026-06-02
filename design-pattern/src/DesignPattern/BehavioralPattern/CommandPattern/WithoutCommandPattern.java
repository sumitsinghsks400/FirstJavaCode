package DesignPattern.BehavioralPattern.CommandPattern;
class TextEditor {
    public  void boldText() {
        System.out.println("Text has been bolded");
    }
    public  void italicizeText() {
        System.out.println("Text has been italicizeText");
    }
    public  void underLineText() {
        System.out.println("Text has been italicizeText");
    }
}
//ui button
class  BoldButton {
    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public  void click(){
        textEditor.boldText();
    }
}
class  ItalicizeButton {
    private TextEditor textEditor;

    public ItalicizeButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public  void click(){
        textEditor.italicizeText();
    }
}
class  UnderLineButton {
    private TextEditor textEditor;

    public UnderLineButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public  void click(){
        textEditor.underLineText();
    }
}

public class WithoutCommandPattern {
    public static void main(String[] args) {
       TextEditor textEditor= new TextEditor();
       BoldButton boldButton= new BoldButton(textEditor);
        boldButton.click();
        ItalicizeButton italicizeButton = new ItalicizeButton(textEditor);
        italicizeButton.click();

    }
}
