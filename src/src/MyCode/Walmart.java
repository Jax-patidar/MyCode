package MyCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Walmart {

//    1 2 3 4 5 6 7 8 9
//
//    10
//    1 2
//
//
//    9 8 7 6 5 4 3 2 1
//
//    7
//    1 7 4 3
//    1 4 3 7     5
//
//    1 4 3 7 5    6
//
//    4 3 7 5 6
//
//    3
//
//    arrayList  = 4 3 5 6 7
//
//    4 5 6 7 3
//
//    5
//    4 5 6
//    4 6 5



static Map<Integer,Node> map = new HashMap<>();

static  int limit = 5;

    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data =data;
            Node prev =null;
            Node next =null;
        }
    }

    Node first;
    Node last;

    public static void main(String[] args) {

        int input=10;

        //getValue(input);


    }

    int getValue(int input)
    {
        if (map.size() >= limit)
        {
            if(map.containsKey(input)) {
                Node temp = map.get(input);
                map.remove(input);
                map.put(input,temp);
            }
        }else
        {
            if(map.containsKey(input)) {
                Node temp = map.get(input);
                map.remove(input);
                map.put(input,temp);
            }else
            {
                Node temp = new Node(input);
                if(this.first !=null)
                {
                    //fi
                }
                map.put(input,temp);
            }
        }
        return input;
    }





}
