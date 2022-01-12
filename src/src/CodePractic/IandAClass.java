package CodePractic;

import groovyjarjarantlr4.v4.runtime.misc.FlexibleHashMap;

import java.util.*;

public class IandAClass {
    public static void main(String[] args) {
        Queue<String> q =new PriorityQueue<String>((o1, o2) -> {
            if(o1.equals(o2))
            {
                return 0;
            }else if(o1.compareTo(o2)>0)
            {
                return -1;
            }else
            {
                return 1;
            }
        });
        q.add("5");
        q.add("1");
        q.add("3");
        while (q.size()>0)
        {
            if(q.size()==3)
            {
                q.add("-1");
                q.add("2");
                System.out.println(q.remove());
                System.out.println(q.remove());
            }
            System.out.println(q.remove());
        }





        Map<String,String> k = new TreeMap<>();
        k.put("Jagdish","5");
        k.put("Anamika","2");
        k.put("Jagdish","6");
        k.put("Bagdish","2");
        k.put("Jagdish","7");

        for (Map.Entry<String,String> t :k.entrySet() ) {

            System.out.println(t.getKey()+t.getValue());
        }

        System.out.println("After TreeMap");

        List<String> l = new ArrayList<>();
        l.add("Jagdish");
        l.add("Patidar");
        for (int i = 0; i < l.size(); i++) {
            l.add("K");
            System.out.println(l.get(i));
        }



    }
}
