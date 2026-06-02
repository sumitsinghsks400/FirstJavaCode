package DesignPattern.StructuralDesignPattern.ProxyPattern;
interface  Image1 {
    void display();

}

class RealImage1 implements Image {
    private  String fileName;

    public  RealImage1(String fileName) {
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
class  ProxyImage implements Image1 {
  private  String fileName;
  private  RealImage1 realImage1;//proxy reference to real image

    public  ProxyImage(String fileName) {
        this.fileName=fileName;
    }
    @Override
    public void display() {
        if(realImage1 == null) {
            realImage1= new RealImage1(fileName);//Image is loaded + cached
        }
        realImage1.display();
    }
}

public class WithProxyPattern {
    public static void main(String[] args) {
  Image1  image= new  ProxyImage("d.png");
        Image1  images= new  ProxyImage("c.png");

        image.display(); // create  real image and display
        images.display();
    }
}
