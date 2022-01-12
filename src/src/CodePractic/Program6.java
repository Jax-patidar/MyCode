package CodePractic;

//[11:41 AM] Mohan Dikshit (AWF)
//Write a Java program which determines third largest number in the array
//
//[11:42 AM] Mohan Dikshit (AWF)
//sample input {1,2,3,4,5}
//
//[11:42 AM] Mohan Dikshit (AWF)
//output 3
//
//[11:42 AM] Mohan Dikshit (AWF)
//{-2,-1,-1,0,2}
//
//[11:43 AM] Mohan Dikshit (AWF)
//output -1
public class Program6 {
    public static void main(String[] args) {
        //int[] ar = {1,2,4,5,6,2,4,10};
        int[] ar ={-1,-3,0,1,1,2,2};
        int target = 3;
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        for (int value:ar)
        {
            if(value > a)
            {
                c = b;
                b = a;
                a = value;
            }else if(value > b)
            {
                c=b;
                b = value;
            }else if(value > c)
            {
                c = value;
            }
        }
        System.out.println(c);
//        //Salary
//        20,10,40,50
//        select amount from Salary order by amount desc limit 0,3;
    }
}
