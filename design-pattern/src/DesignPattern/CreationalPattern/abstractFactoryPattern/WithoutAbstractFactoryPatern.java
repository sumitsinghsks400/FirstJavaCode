package DesignPattern.CreationalPattern.abstractFactoryPattern;


class WindowButton {
    public  void render() {
        System.out.println("Rendering Window Button");
    }
}

class WindoScrollButton {
    public  void render() {
        System.out.println("rendering window button");
    }
}
class WindowOsBar {
    public  void scroll() {
        System.out.println("scrolling WindowOs Button");
    }
}

class WindowOsScrollBar {
    public  void scroll() {
        System.out.println("Scrolling windowMacOS button");
    }
}

public class WithoutAbstractFactoryPatern {
    public static void main(String[] args) {
        WindowButton windowButton = new WindowButton();
        WindowOsScrollBar windowOsScrollBar = new WindowOsScrollBar();
        windowButton.render();
        windowOsScrollBar.scroll();

    }
}
