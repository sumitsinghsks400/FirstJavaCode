package CollectsDemo.ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LastCharShorting implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        char lastCharValue = o1.charAt(o1.length()-1);
        char lastChar2= o2.charAt(o2.length()-1);

      //  return lastCharValue>lastChar2?1:-1;
        return  Character.compare(lastCharValue,lastChar2);
    }

    public static void main(String[] args) {
        var countery= new ArrayList<String>();
        countery.add("india");
        countery.add("iiryn");
        countery.add("japan");
        countery.add("iirana");
        countery.add("pakistan");
        System.out.println(countery);
      //  countery.sort(new LastCharShorting());

        Collections.sort(countery,new LastCharShorting());

        System.out.println(countery);
    }
}
