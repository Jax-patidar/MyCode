package CodePractic;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

//check if two strings are anagrams of each other.
//str1 --> abcde
//str2-->  ecbad
public class Program14 {
    public static void main(String[] args) {

        String a = "abcde";
        String b = "ecbad";
        boolean result = false;
        if(a.length() != b.length())
        {
            result = false;
        }
        Map<Character,Integer> map1 = new TreeMap<>();
        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            if(map1.containsKey(temp))
            {
                map1.put(temp,map1.get(temp)+1);
            }else
            {
                map1.put(temp,1);
            }
        }
        Map<Character,Integer> map2 = new TreeMap<>();
        for (int i = 0; i < b.length(); i++) {
            char temp = b.charAt(i);
            if(map2.containsKey(temp))
            {
                map2.put(temp,map2.get(temp)+1);
            }else
            {
                map2.put(temp,1);
            }
        }

        System.out.println("String 1"+map1);
        System.out.println("String 2"+map2);


    }
}
