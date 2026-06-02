package DesignPattern.StructuralDesignPattern.FlyWeightPattern;
class Bullets {
    private String color;

    private  int x, y;

    private  int velocity;

    public Bullets(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + "," + y +  " ) with velocity " + velocity );


    }
    public void display() {
        System.out.println("Creating bullet at (" + x + "," + y +  " ) moving at  velocity " + velocity );
    }
}
public class WithoutFlyWeightPattern {
    public static void main(String[] args) {
        //5 red  Bullet
        for(int i=0; i<5; i ++) {
            Bullets bullets = new Bullets("RED", i * 10, i * 12, 5);
        }
        for(int i=0; i<5; i ++) {
            Bullets bullets1 = new Bullets("green", i*10, i*12,5);
        }
// problem
        // memory overhead >every Bullet stores  redundant data like  colar
        // performance  slow performance  when many bullet created
    }
}
