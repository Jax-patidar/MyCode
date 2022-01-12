package CodePractic;
import java.util.ArrayList;
import java.util.List;
//Sample Input       : [0, -1, 5, 0, 4, 0, -9, 0]
  //   Output        : [-1, 5, 4, -9, 0, 0, 0, 0]

//Given two inputs. One is array [1,3,2,5,4,6]. Another one is target = 9.
// You need to find list of sub arrays where the sum of the elements should equal the target.
//Output:  [1,3,5], [5,4] [1,2,6] [3,6]
public class Program4 {
    public static void main(String[] args) {

        int []a = {1,3,2,5,4,6};
        int target =9;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < a.length; j++) {
                if(sum==target)
                {
                    result.add(temp);
                    break;
                }else if(target<sum)
                {
                    temp = new ArrayList<>();
                    break;
                }
                if(sum < target && target-sum >= a[j])
                {
                    sum = sum+a[j];
                    temp.add(a[j]);
                }
            }
        }

        System.out.println(result);


//        Student
//                Name, Age
//
//                Jagdis, 20 Patidar 21 , Gokul  20
//                20, 2 21,1
//
//                select age, count(age) from Student group by Age


    }
}
