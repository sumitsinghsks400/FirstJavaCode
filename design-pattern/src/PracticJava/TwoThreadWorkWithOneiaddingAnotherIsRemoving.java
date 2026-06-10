package PracticJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TwoThreadWorkWithOneiaddingAnotherIsRemoving {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Map<Integer, String> map = new ConcurrentHashMap<>();
        // Map<Integer, String> map = new HashMap<>();
        map.putIfAbsent(841401, "baldihan");
        map.putIfAbsent(800001, "patna");
        map.putIfAbsent(841402, "lakhana");
        map.putIfAbsent(841403, "amnour");
        map.putIfAbsent(841404, "dharhara");
        map.putIfAbsent(841401, "baldihan");
        System.out.println(map);

        mythread t1 = new mythread(map);
        t1.start();
        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer,String> entery =  itr.next();
            System.out.println(entery);

            Thread.sleep(2000);

        }
    }

}

class mythread extends Thread {
    Map<Integer, String> map;
    public mythread(Map<Integer, String> map) {
        this.map = map;

    }
    @Override
    public void run() {
        try {
            map.remove(800001);

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
