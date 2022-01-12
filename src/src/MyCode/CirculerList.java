package MyCode;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CirculerList {

    static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val =val;
            this.next = null;
        }

    }
    public static void main(String[] args) {

        Node head = new Node(4);
        Node node1 = new Node(5);
        Node node2 = new Node(7);
        Node node3 = new Node(8);
        head.next = node1;
        head.next.next = node2;
        head.next.next.next = node3;
        //node2.next = head;

        while(head !=null)
        {
            System.out.println(head.val);
            head = head.next;
        }

        ReadWriteLock r = new ReentrantReadWriteLock();







    }

}
