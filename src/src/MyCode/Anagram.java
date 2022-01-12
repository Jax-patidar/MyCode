package MyCode;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {
        String word1="army";
        String word2="mary";
        System.out.println(isAngm(word1,word2));
    }
    static boolean isAngm(String w1,String w2)
    {


        if(  w1.length()!=w2.length())
            return false;

        char []cw1 = w1.toCharArray();
        char []cw2 = w2.toCharArray();
        Arrays.sort(cw1);
        Arrays.sort(cw2);
        w1="";
        w2="";
        for (char c:cw1
             ) {
            w1+=c;
        }
        for (char c:cw2
        ) {
            w2+=c;
        }


        //System.out.println(w1+"  "+w2);
        if (w1.equals(w2))
            return true;


        return false;
    }
}
