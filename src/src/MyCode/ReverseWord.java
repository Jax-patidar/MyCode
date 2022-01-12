package MyCode;

import java.util.Arrays;
import java.util.List;

public class ReverseWord {
    public static void main(String []a)
    {
        List<String> ss = Arrays.asList("1","2","3","4");
        String[] strAr1 = new String[]{"Ani", "Sam", "Joe"};
        Arrays.sort(strAr1);



        String s = "the sky is   blue";
        System.out.println(s.concat("Jav"));

        System.out.println("Input is: "+ s);
        String result ="";
        String str = "";
        boolean k = true;
        for (int i = s.length() -1; i >= 0; i--)
        {
            if(s.charAt(i) != ' ')
            {
                str = str + s.charAt(i);
                k = true;
            }else
            {
                if(k)
                {
                    StringBuilder temp = new StringBuilder(str);
                    result =  result + temp.reverse() + " ";
                    k = false;
                    str = "";
                }
            }
        }

        StringBuilder temp = new StringBuilder(str);
        result =  result + temp.reverse();
        k = false;
        str = "";

        System.out.println("Input is: "+ result);

    }
}
