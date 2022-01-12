package MyCode;

import java.util.Arrays;

public class CountInString {
    public static void main(String[] args) {
        String input = "jagdishpatidar";

        int[] ascii = new int[26];

        char[] atc = input.toCharArray();
        for (int i = 0; i < atc.length; i++) {
            int temp = atc[i]-'a';
            int count = ascii[temp];
            ascii[temp]=count+1;
        }

        for (int index=0;index<ascii.length;index++) {
            if(ascii[index]>0)
            {
                int kk = 'a';
                char charr =  (char)(index + kk);
                System.out.print (ascii[index] +""+charr+" ");
            }
        }
    }
}
