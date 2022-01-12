package MyCode;

import java.util.*;

public class Infusion {

    public static void printUniqeValue(List<Person> person)
    {
        Map<String, Set<String>> map = new HashMap<>();
        for (Person per:person) {
            String firstLast = per.name+" "+per.lName;
            if (map.containsKey(firstLast))
            {
                Set<String> ss = map.get(firstLast);
                ss.add(per.phone);
                map.put(firstLast,ss);
            }else
            {
                Set<String> ss = new HashSet<>();
                ss.add(per.phone);
                map.put(firstLast,ss);
            }
        }
        map.forEach( (k,v) -> System.out.println(k +" : "+v.size()));

    }


    public static void main(String[] args) {
        List<Person> p = new ArrayList<>();
        p.add(new Person ("Jim", "Jones","111"));
        p.add(new Person ("Bob", "Smith", "222"));
        p.add(new Person ("Dan", "Williams", "333"));
        p.add(new Person ("Jim", "Jones","111"));
        p.add(new Person ("Bob", "Smith", "222"));
        p.add(new Person ("Jim", "Jones", "222"));
        p.add(new Person ("Jim", "Jones", "333"));
        p.add(new Person ("Dan", "Williams","111"));
        p.add(new Person ("Jim", "Jones", "111"));
        p.add(new Person ("Bob", "Smith", "111"));
        p.add(new Person ("Jim", "Jones", "111"));
        p.add(new Person ("Dan", "Williams","444"));
        p.add(new Person ("Dan", "Williams", "555"));

        p.forEach( k -> System.out.println(k));

        printUniqeValue(p);

    }
}



class Person
{
    String name;
    String lName;
    String phone;
    public Person(String name, String lName, String phone)
    {
        this.name = name;
        this.lName = lName;
        this.phone = phone;
    }
}
