package MyCode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SteamPrograms {
    public static void main(String[] args) {

        //getList();
       // getSet();
        getTreeSet();




    }
    public static void getSet() {
        Student s1 = new Student(1, "Jadish Patidar", 30);
        Student s2 = new Student(1, "Jadish Patidar", 30);
        Student s3 = new Student(1, "Jadish Patidar", 30);
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());


    }

    public static void getTreeSet() {
        Student s1 = new Student(1, "Jadish Patidar", 31);
        Student s2 = new Student(1, "Jadish Patidar", 30);
        Student s3 = new Student(1, "Jadish Patidar", 30);
        TreeSet<Student> set = new TreeSet<>( (o1, o2) -> {return 1; } );
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());


    }
    public static void getList()
    {
        Student s1 = new Student(1, "Jadish Patidar", 30);
        Student s2 = new Student(2, "Shyam Patidar", 28);
        Student s3 = new Student(3, "Ravi Patidar", 29);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        Collections.sort(list, (o1, o2) -> {
//            if (o1.age == o2.age)
//                return 0;
//            if (o1.age > o2.age)
//                        return 1;
//            return -1;
//                }
//        );

//        for (Student s : list) {
//            System.out.println( s.name);
//        }
        //list.stream().filter(s->s.age>30).collect(Collectors.toList());
        List<String> ll =  list.stream().filter(s -> { if (s.age>28)
            return true;
            return false;}  ).map(s->s.name).collect(Collectors.toList());

        for (String s : ll) {
            System.out.println( s);
        }
    }
}








 class Student
 {
     int rollNum;
     String name;
     int age;

     public int getRollNum() {
         return rollNum;
     }

     public String getName() {
         return name;
     }

     public void setRollNum(int rollNum) {
         this.rollNum = rollNum;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public Student(int rollNum, String name, int age)
     {
         this.age = age;
         this.name = name;
         this.rollNum = rollNum;
     }


 }
