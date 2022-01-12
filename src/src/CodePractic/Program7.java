package CodePractic;

import java.util.Stack;

public class Program7 {
    int fixed_size =10;
    int[] list = new int[fixed_size];
    int size=0;

    void add(int value)
    {
        if(fixed_size>=size)
        {
            list[size] = value;
            size++;
        }
        else
        {
            fixed_size = fixed_size*2;
            int[] newList = new int[fixed_size];
            for (int i = 0; i < list.length; i++) {
                newList[i]=list[i];
            }
            newList[size++] = value;
            list = newList;
        }
    }

//    Employee
//    Ram 1000
//    Lakhashaman 2000
//            Bharth 100
//
//            ....Stack
//
//    Select salary from Employee group by salary order by salary desc limit n-1,1;
//
//    select salary from Employee










    public static void main(String[] args) {

    }

}
