package DesignPattern.StructuralDesignPattern.FlyWeightPattern;

import java.util.HashMap;

class BulletType {
    private String color;



    public BulletType(String color) {
        this.color = color;

        System.out.println("Creating bulletType  with color "+color ); }

}
class Bullet {
    private  BulletType bulletType;

    private  int x, y;

    private  int velocity;

    public Bullet(String color,int x, int y, int velocity) {
this.bulletType=BuletTypeFactory.getBullType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + "," + y + " ) with velocity " + velocity);

    }





    }

    class BuletTypeFactory {
    private  static final HashMap<String , BulletType> bulletsType = new HashMap<>();

    public static  BulletType getBullType (String Color) {
        if(!bulletsType.containsKey(Color)) {
            bulletsType.put(Color, new BulletType(Color));
        }
        return bulletsType.get(Color);
    }
    }


public class WithFlyWeightPattern {
    public static void main(String[] args) {
        //5 red  Bullet
        for(int i=0; i<5; i ++) {
            Bullet bullets = new Bullet("RED", i * 10, i * 12, 5);
        }
        for(int i=0; i<5; i ++) {
            Bullet bullets1 = new Bullet("green", i*10, i*12,5);
        }
    }
}
