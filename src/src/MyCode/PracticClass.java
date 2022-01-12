package MyCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticClass {
    public static void main(String[] args) {

        String k = "Jagdish";
        char[] a = k.toCharArray();
        HashMap<String,String> mapp = new HashMap<>();


        //String kk = Arrays.toString(a);
        System.out.println(a);



        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");


        for (Map.Entry m : map.entrySet())
        {

            int kk = (Integer) m.getKey();
            System.out.println(kk);


        }


    }
}
