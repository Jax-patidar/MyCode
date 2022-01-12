package CodePractic;

import groovyjarjarantlr4.v4.codegen.model.chunk.QRetValueRef;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Program15 {

    public static void main(String[] args) {
        //input of list        two node A-B, C-Z, Z-A, L-B, N-B   B , A L N, Z C
        //        B
           //   A  L  N
          //   Z
//        List<String> list = new ArrayList<>();
//        list.add("A-B");
//        list.add("C-Z");
//        list.add("Z-A");
//        list.add("L-B");
//        list.add("N-B");
//        for (int i = 0; i < ; i++) {
//        }
        //  [2,9, 4,5,12,34,76], sum =
        int []ary = {50,9,100,5,11,3,7};
        int sum = 21;
        int target = 0;
        int index = 0;
        for (int i = 0; i < ary.length; i++) {
            target = target +ary[i];
            if(target <= sum)
            {
                if (target == sum)
                {
                    //return true;
                }
            }else {
                //target =  Math.
                while(target > sum)
                {
                    target = target - ary[index];
                    index++;
                    if(target == sum)
                    {
                        //return true
                    }
                }
            }
        }
        //return false
    }
}
