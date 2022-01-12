package MyCode;


import kotlin._Assertions;

import java.util.*;
import java.util.stream.Stream;

public class HCLWrittenTest extends A{
    public static void main(String[] args) {
        //B b = new B();


    }

}






class A
{
    static int add(int a, int b)
    {
        return  a+b;
    }
}

class B extends A{
    B()
    {
        short s =7;
        System.out.println(add(s,3));
    }
}



class TreeSett
{
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(2);
        t.add(3);
        t.add(7);
        t.add(5);
        //t.add(3);
        SortedSet<Integer> st = t.subSet(1,7);
        st.add(4);
        st.add(6);

        st.forEach(k-> System.out.println(k));


    }
}


class SteamList
{
    public static void main(String[] args) {

        List<String> t = new ArrayList<>();
        t.add("sam");

        t.add("sam");
        t.add("saj");
        t.add("tam");
        Stream<String> l = t.stream();
        System.out.println(t.stream().distinct().count());
        System.out.println(t.stream().count());
    }
}


 interface AA {
    default public void disply()
    {
        System.out.println("AA");
    }
}
interface BB {
    default public void disply1()
    {
        System.out.println("BB");
    }
}

class CC implements AA,BB
{
//    public void disply()
//    {
//        //AA.super.disply();
//        System.out.println("CC");
//
//    }

    public static void main(String[] args) {
        CC cc = new CC();
        cc.disply();
    }

}
