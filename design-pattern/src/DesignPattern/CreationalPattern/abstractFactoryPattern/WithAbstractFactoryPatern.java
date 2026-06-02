package DesignPattern.CreationalPattern.abstractFactoryPattern;

interface  Button{
    void render();

}
 interface ScrollBar{;
     void render();
 }


class WindowButtons implements  Button  {
    @Override
    public  void render() {
        System.out.println("Rendering Window Button");
    }
}

class WindoOsButtonS implements Button {
    @Override
    public  void render() {

        System.out.println("rendering window button");
    }
}
class WindowScollerBar implements  ScrollBar{
    @Override
    public  void render() {
        System.out.println("Rendering WindowOs Button");
    }
}

class WindowOsScrollBars implements  ScrollBar{
    @Override
    public  void render() {
        System.out.println("rendering windowMacOS button");
    }
}

interface  UiFactory{
    Button CreateButton();
    ScrollBar createScrollBar();

}
class WindowFactory implements  UiFactory {

    @Override
    public Button CreateButton() {
        return new WindowButtons();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowScollerBar() ;
    }
}

class MacOsFactory implements  UiFactory {

    @Override
    public Button CreateButton() {
        return new WindoOsButtonS() ;
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowOsScrollBars();
    }
}

public class WithAbstractFactoryPatern {
    private  Button button;
    private  ScrollBar scrollBar;

    public WithAbstractFactoryPatern(UiFactory factory) {
        this.button=factory.CreateButton();
        this.scrollBar=factory.createScrollBar();
    }

    public  void  renderUi() {
        button.render();
        scrollBar.render();
    }
    public static void main(String[] args) {
  UiFactory windowFactory = new WindowFactory();


        WithAbstractFactoryPatern withAbstractFactoryPatern=new WithAbstractFactoryPatern(windowFactory);
        WithAbstractFactoryPatern withAbstractFactoryPatern1=new WithAbstractFactoryPatern(new MacOsFactory());


        withAbstractFactoryPatern.renderUi();
        withAbstractFactoryPatern1.renderUi();

    }
}
