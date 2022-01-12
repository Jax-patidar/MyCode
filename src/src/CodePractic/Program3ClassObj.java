package CodePractic;

import java.util.Date;

public class Program3ClassObj {
    public static void main(String[] args) {
        Date dbo  = new Date();
        String name ="Jagdish";
        Program3 program3 = new Program3(name,dbo);

        System.out.println(program3.getDbo()+" ");
        program3.getDbo().setDate(1);
        System.out.println(program3.getDbo());
    }
}
