package CodePractic;

import java.lang.reflect.Array;
import java.util.*;

final class Program2 {
    private final String a;
    private final int b;
    Program2(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA()
    {
        return this.a;
    }
    public int getB()
    {
        return this.b;
    }

    public static void main(String[] args) {
        String str =  "jagdishpatidar";
        char[] sa = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < sa.length; i++) {
            if(map.containsKey(sa[i]))
            {
                int count = map.get(sa[i])+1;
                map.put(sa[i],count);

            }else
            {
                map.put(sa[i],1);
            }
        }

        for (Map.Entry<Character, Integer> s:map.entrySet()) {
            System.out.println("Character: "+s.getKey()+" count: "+s.getValue());
        }

        List<String> kk = new ArrayList<>();

        kk.add("Ram");
        kk.add("Syam");
        for (String kkk:kk
        ) {
            kkk += "50";
        }
        System.out.println(kk);
        // select * from SalaryTable order by salaryColoum desc limit 3 , 2
    }
}
