package PracticJava;

public class GenricClass {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Gen<Integer> gen = new Gen<>();
        gen.add(2);

        System.out.println(gen.get());
    }

}

class Gen<T> {
    T obj;
    public void  add (T obj) {
        this .obj = obj;

    }

    T get() {
        return obj;

    }

}
