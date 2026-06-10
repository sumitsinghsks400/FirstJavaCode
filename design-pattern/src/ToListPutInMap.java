import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToListPutInMap {
    public static void main(String[] args){
        Map<String, Object> steps1 = new HashMap<>();
        steps1.put("key11", "value11");
        steps1.put("key12", "value12");

        Map<String, Object> steps2 = new HashMap<>();
        steps2.put("key21", "value21");
        steps2.put("key22", "value22");

        List<Map<String, Object>> steps = new ArrayList<>();
        steps.add(steps1);
        steps.add(steps2);

        HashMap<String,Object> hashMap= new HashMap<>();

        Map<String, Object> result = join(steps,hashMap);
       // Stream.concat(steps1,steps2).forEach();

        System.out.println(result);
    }

    private static Map<String, Object> join(List<Map<String, Object>> steps, HashMap<String,Object> hashMap) {
        //steps.stream().forEach(hashMap::putAll);
        steps.stream().forEach(a->a.entrySet().forEach(p->hashMap.put(p.getKey(), p.getValue())));
        return hashMap ;
    }


}