package DesignPattern.StructuralDesignPattern.ProxyPattern;

interface  Image {
    void display();

}

class RealImage implements Image {
    private  String fileName;

    public  RealImage(String fileName) {
        this.fileName=fileName;
        loadImageFromDisk();
    }
private  void  loadImageFromDisk() {
        System.out.println("Loading image from the disk " + fileName);
}
    @Override
    public void display() {
        System.out.println("Displaying : "+ fileName);
    }
}
public class WithoutProxyPattern {
    public static void main(String[] args) {
      Image image = new RealImage("dog.png")  ;
        Image image1 = new RealImage("dog.png")  ;
//Here the Real Image is loaded everyTime  we create it
        //which can be inefficent if the image is not always required

        image1.display(); //lazy loading
    }
}
