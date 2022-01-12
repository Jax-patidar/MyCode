package CodePractic;

import java.util.ArrayList;
import java.util.List;

public class Program9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        System.out.println(list.size());
        int callByValue = 5;
        System.out.println("Call by Value before: "+callByValue);
        callByRef(list);
        callByValue(callByValue);
        System.out.println("Call by Value after: "+callByValue);
        System.out.println(list.size());

    }

    private static void callByValue(int callByValue) {
        callByValue =10;
    }

    private static void callByRef(List<Integer> list) {
        list.add(4);
    }

}

final class ImutableClass
{
    private final String name;
    private final int id;
    ImutableClass(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
}



class SingleTone
{
    static SingleTone singleTone = null;
    private SingleTone()
    {
    }
    public static SingleTone getSingleToneObj()
    {
        if(singleTone == null)
        {
            synchronized (SingleTone.class)
            {
                if(singleTone == null) {
                    singleTone = new SingleTone();
                }
            }

        }
        return singleTone;
    }



}
