package MyCode;

import java.util.Optional;
import java.util.Scanner;

public class FabbNicSeris {


    public static void main(String[] args) {
        Optional<String> o = Optional.ofNullable("");
        System.out.println(o.isPresent());

        // 0 1 1 2 3 5 8
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int count = 0;
        int first = 0;
        int second = 1;

        while (count <= input)
        {
            if (count==0)
            {
                System.out.print(first + " " + second);
                int temp = second;
                second = first + second;
                first = temp;
                count = second;
            }else {
                System.out.print(" " + second);
                int temp = second;
                second = first + second;
                first = temp;
                count = second;
            }
        }



    }
}
