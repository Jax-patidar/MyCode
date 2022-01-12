package CodePractic;

import java.util.*;

//String "cbdffshrehdjhfkd"
public class Program13 {

    public static void main(String[] args) {
        String str = "jagdishpatidar";
        Map<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(map.containsKey(temp))
            {
                map.put(temp, map.get(temp)+1);
            }else
            {
                map.put(temp,1);
            }
        }



        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            System.out.println("Char: "+ entry.getKey()+" Count: "+entry.getValue());
        }



    }


}



class A
{
    void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 A");
    }
}
class B extends A
{
    void m1() throws IndexOutOfBoundsException
    {
        System.out.println("In m1 B");
    }
}


 class Test {

    public static void main(String[] args) {
        A a=new B();
        a.m1();
    }
}
