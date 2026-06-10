package CollectsDemo.Map;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        //var map= new HashMap<String,String>();
        map.put("india","new Delhi");
        map.put("india","new Delhi 1");
        map.put("usa","Washington Dc");
        map.put("France","paris");
        map.put(null,null);
        map.put(null,null);
        map.put("hhh",null);

        System.out.println(map);
        System.out.println(map.get("india"));
        map.remove(null);

        System.out.println(map.size());
    }
}
