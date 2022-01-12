package MyCode;

import java.util.*;
import java.util.stream.Collectors;

public class SortestLength {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,13,4,4));

        //list.stream().filter(i -> Collections.frequency(list, i) >1)
                //.collect(Collectors.toSet()).forEach(System.out::println);

        list.stream().collect(Collectors.toSet()).forEach(k->
            System.out.println(k+" is repeated of : "+Collections.frequency( list, k)));
        Integer aa = new Integer(80);
        Integer bb = new Integer(80);
        if(aa.equals(bb)) {
            System.out.println(true);
        }
//        }else
//            System.out.println(false);

//        for (int l:list)
//        {
//            int key = l;
//            if(map.containsKey(l))
//            {
//                int k = map.get(l);
//                k = k+1;
//                map.put(l,k);
//            }else
//            {
//                map.put(l,1);
//            }
//        }









//        String str = "it is out to jagdish patidar h out jagdish to";
//        String word1 = "out";
//        String word2 = "to";
//        getSortLen(str,word1,word2);







    }

    static double getSortLen(String str,String word1, String word2)
    {
        System.out.println(str.length());
        String[] words = str.split(" ");
        double result = str.length();
        int index = 0;
        double p1 = 0;
        double p2 = 0;

        double finalR = 0;

        for(String word:words)
        {
            if (word.equals(word1))
            {
                p1 = index + Double.valueOf(word.length())/2;
            }else if (word.equals(word2))
            {
                p2 = index + Double.valueOf(word.length())/2;
            }

            if(p1>0 && p2>0)
            {
                finalR = p2-p1;
                if(finalR<result)
                {
                    result = finalR;
                }
                p1=0;
                p2=0;
            }
            index = index+word.length()+1;
        }
        System.out.println(p1+" "+p2);
        System.out.println(result);
        return 0.0;
    }
}
