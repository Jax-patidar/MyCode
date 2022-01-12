package MyCode;

import java.util.ArrayList;
import java.util.List;

 final class Oracle {

private final int id;
private final String  name;
private final List<String> address;

public Oracle(int id, String name, List<String> address)
{
    this.id = id;
    this.name = name;
    this.address = address;
}

public int getId()
{
    return this.id;
}

    public String getName()
    {
        return this.name;
    }

    public List<String> getAddress()
    {
        List<String> newAddress = new ArrayList<>();
        if (this.address.size()==0)
        {
            return newAddress;
        }else
        {
            for (String adr:this.address
                 ) {
                newAddress.add(adr);

            }
        }
        return newAddress;


    }



}



class SingleTonee
{
    private static SingleTonee SingleTone;
    private SingleTonee()
    {
    }

       public static SingleTonee getSingleTone() {
        if (SingleTone==null)
        {
            SingleTone = new SingleTonee();
        }

        return SingleTone;
        }
}

//Add 1 to it. For example 1999 is represented as (1-> 9-> 9 -> 9) and
// adding 1 to it should change it to (2->0->0->0)
//        (3-> 2-> 4 -> 5) and adding 1 to it should change it to (3-> 2-> 4 -> 6)


class PlusOne {

    /* Linked list node */
    static class Node {
        int data;
        Node next;
        Node(int k)
        {
            this.data = k;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(4);
        head.next.next.next = new Node(9);

        //Added one in linked list
        //addOneIn(head);
        reverseGroup(head);

    }

    private static void reverseGroup(Node head)
    {
        Node temp = head;
        Node res = null;
        int limit = 2;
        int counter = 0;
        while(head!=null)
        {
            if(counter == 2)
            {
                Node tempp = getReverse(temp);
                if(res==null) {

                }else {

                }
                head = head.next;
            }else {
                counter++;
                head = head.next;
            }
        }

        while (res != null)
        {
            System.out.print(res.data +" ");
            res = res.next;
        }


    }

    private static void addOneIn(Node head) {
        //reverse first time
        Node rev = getReverse(head);

        Node temp = rev;
        int carry = 0;
        boolean isCarryAdded = false;
        Node lastNode = null;
        while (rev!=null) {
            if(rev.data > 8)
            {
                rev.data = 0;
                carry = 1;
                lastNode = rev;
                rev =  rev.next;
            }else
            {
                isCarryAdded =true;
                rev.data = rev.data + carry;
                break;
            }
        }
        if (!isCarryAdded)
        {
            lastNode.next = new Node(carry);
        }

        //reverse again
        temp = getReverse(temp);
        while (temp!=null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    private static Node getReverse(Node head) {
        Node c =  head;
        Node n = null;
        Node p = null;
        while(c!=null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }


    static Node addOne(Node head){

        Node n = head;
        Node current = null;
        Node prev = null;
        while(n!=null)
        {
            current = n.next;
            n.next = prev;
            prev = n;
            n = current;
        }

        Node reverse = prev;

        int carryInt = 0;


        //(9-> 9-> 9) and adding 1 to it should change it to (1->0-> 0-> 0)


        while(reverse!=null  )
        {
            if(reverse.data > 8)
            {
                int actualValue = reverse.data+1;
                reverse.data = actualValue%10;
                carryInt = (actualValue)/10;
                reverse = reverse.next;
            }else {

                reverse.data = reverse.data + carryInt;
                break;
            }
        }




        return reverse;




    }






}




class NewProgram1 {
//    void String(String s1)
//    {
//
//    }
//
//    void String(String s1)
//    {
//
//    }


    public static void main(String[] args) {
        int[]a = new int[200];

        a[1]=8;
        a[2]=4;
        a[3]=3;


        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {

                if(a[i]>a[j] && a[j]!=0)
                {
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
        }
    }
}

class OverLoaded
{
    void getx(int x)
    {
        System.out.println(" One X");
    }

    void getx(int... x)
    {
        System.out.println(" ... x");
    }
    public static void main(String[] args) {
        OverLoaded overLoaded = new OverLoaded();
        overLoaded.getx(1);
        overLoaded.getx(3,3);
        overLoaded.getx();
        overLoaded.getx(4);
    }


}


