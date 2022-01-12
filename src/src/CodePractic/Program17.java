package CodePractic;

import java.util.*;

//Given a string str, find the length of the longest substring without repeating characters.
//•	For “ABDEFGABEF”, the longest substring are “ABDEFG”,“BDEFGA” and “DEFGAB”, with length 6.
//•	For “BBBB” the longest substring is “B”, with length 1.
public class Program17 {
    public static void main(String[] args) {
       String str = "ABDEFGABEF";
        //String str = "BBBB";
       String tempString = "";
       Map<Character,String> set = new HashMap();
       int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (tempString.contains(String.valueOf(str.charAt(i))))
            {
                if (length<tempString.length())
                {
                    length = tempString.length();
                }
                tempString = tempString.substring(0,tempString.indexOf(str.charAt(i)));
                tempString = tempString + str.charAt(i);
            }else
            {
                tempString = tempString + str.charAt(i);
            }
        }
        System.out.println("Max length of sub string is : "+length);
    }
}
