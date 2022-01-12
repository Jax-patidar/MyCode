package CodePractic;
//Reverse an array without affecting special characters
//Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
//Examples:
//Input:   str = "a,b$c"
//Output:  str = "c,b$a"
//Note that $ and , are not moved anywhere.
//Only subsequence "abc" is reversed
//
//Input:   str = "Ab,c,de!$"
//Output:  str = "ed,c,bA!$"


import java.util.Stack;

//c) For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.
//Element       NGE   4      -->   5   5      -->   25   2      -->   25   25     -->   -1

//Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
//For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”
public class Program12 {
    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        Stack<Character> s = new Stack<>();
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ')')
            {
                if(s.pop() == '(')
                {

                }else
                {
                    result =false;
                }
            } else
            if(str.charAt(i) == ']')
            {
                if(s.pop() == '[')
                {

                }else
                {
                    result =false;
                }
            } else
                if(str.charAt(i) == '}')
            {
                if(s.pop() == '{')
                {

                }else
                {
                    result =false;
                }
            }else
            {
                s.push(str.charAt(i));
            }
        }







    }

}



