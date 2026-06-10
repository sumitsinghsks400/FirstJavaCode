package JavaInterviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequencyRemoveDublicateAndCountAndPrintDublicate7 {
    public static void main(String[] args) {
        String s ="sumitkukmar";
        System.out.println(s);
        //1frequency count
        // s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(ch->ch,Collectors.counting())).entrySet().forEach(System.out::println);

        //2.only print dublicate

        Map<String, Long> collect = Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(d->d,Collectors.counting()));
        // collect.entrySet().stream().filter(a->a.getValue()>1).forEach(System.out::println);
        //3. Remove dublicate
        // Arrays.asList(s.split("")).stream().distinct().forEach(System.out::println);

        //4.print by comparing key value reverse
        // s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(d->d,Collectors.counting()))
        //	 .entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(a->System.out.println(a));;
        //	 System.out.println("-----------------------------");
        //5. print by comparing key value
        // s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(d->d,Collectors.counting()))
        // .entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(a->System.out.println(a));;
        //6.count
        // Map<String, Long> collects = Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(d->d,Collectors.counting()));
        //	 long count = collects.entrySet().stream().filter(a->a.getValue()>1).map(h->h.getKey()).count();

        //	 System.out.println(count);

        //7.Start with any char

        // Arrays.asList(s.split("")).stream().filter(a->a.toString().startsWith("k")).forEach(System.out::println);

        //.8
        String f ="dkjlmfgfkhh";


        char[] charArray = f.toCharArray();


        int [] freq= new int[charArray.length];

        for (int i=0;i<charArray.length;i++) {
            freq[i]=1;
            for(int j=i+1;j<charArray.length;j++) {
                if(charArray[i]==charArray[j]) {
                    freq[i]++;
                    charArray[j]='0';

                }
            }

        }
        for(int i=0;i<freq.length;i++) {
            if(charArray[i]!='0')
                System.out.println(freq[i] +" "+charArray[i]);

        }

        //9.
        int arr[] = {1,2,3,4,4,3,2};
        int fre[] = new int[arr.length];
        int visited =-1;
        for(int i=0;i<arr.length;i++) {
            int count =1;

            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    fre[j]=visited;
                }
            }
            if(fre[i] != visited) {
                fre[i]=count;
            }
        }
        for(int i=0;i<fre.length;i++) {
            if(fre[i] != visited) {
                System.out.println(arr[i] +"-==-"+fre[i]);
            }
        }
        //.10
        String ch ="sgfhsfgdssgc";

        HashMap<Character, Long> map = new HashMap<>();

        for(Character c : ch.toCharArray()) {
            map.put(c, map.containsKey(c)?map.get(c)+1:1);
        }

        System.out.println("---------------"+map);

    }



}
