package CodePractic;

import groovy.util.NodeList;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Problem : Merge Overlapping Intervals
        //Intervals: [[1,4],[2,5], [4,7]]


        //Output: [[1,5], [7,9]]
public class Program11 {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 =new ArrayList<>();
        l1.add(1); l1.add(4);
        List<Integer> l2 =new ArrayList<>();
        l2.add(5); l2.add(7);
        List<Integer> l3 =new ArrayList<>();
        l3.add(9); l3.add(10);

        list.add(l1);
        list.add(l2);
        list.add(l3);
        Stack<List<Integer>> result = new Stack<List<Integer>>();

        result.push(list.get(0));
        boolean validMeeting = true;

        for (int i = 1; i < list.size(); i++) {
            List<Integer> temp = list.get(i);
            if(result.peek().get(result.peek().size()-1) < temp.get(0))
            {
                result.push(temp);
            }else
            {
                List<Integer> s = result.pop();
                s.remove(s.size()-1);
                s.add(temp.get(temp.size()-1));
                result.push(s);
            }
        }
        System.out.println(result);

//        for (int i = 0; i < list.size(); i++) {
//            List<Integer> temp = list.get(i);
//            for (int j = 0; j < temp.size(); j++) {
//                if(endTime<temp.get(j)){
//                    endTime = temp.get(j);
//                }else {
//                    validMeeting =false;
//                    endTime = temp.get(temp.size()-1);
//                    break;
//                }
//            }
//
//            if (validMeeting)
//            {
//                result.add(temp);
//            }else
//            {
//                List<Integer> lastList = result.get(result.size()-1);
//                result.remove(lastList);
//                lastList.add(lastList.size()-1,temp.get(temp.size()-1));
//                result.add(lastList);
//            }
//        }




        //System.out.println(result);


    }
}
