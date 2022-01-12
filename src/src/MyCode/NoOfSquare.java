package MyCode;



import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class NoOfSquare
{


    public static void main( String args[] )
    {

        List<Integer> list1 = new ArrayList<>();
        list1.add(null);
        list1.add(4);
        list1.add(5);
        System.out.println(list1.stream().findFirst());


        Integer kk[] = new Integer[] { 112,112, 3, 4, 5, 6 ,6};
        long sum = Arrays.stream(kk).count();
        System.out.println(sum);




        List<Integer> list = Arrays.asList(  kk);


        Map<Integer, Integer> map = new TreeMap<>();
        list.forEach( x-> {
            if(map.containsKey( x )){
                map.put(x,map.get( x )+1);
            }
            else{
                map.put(x,1);
            }
        });


       // AtomicInteger i = new AtomicInteger( 0 );


       // map.entrySet().stream().map(x->x.setValue( x.getValue() ));


        System.out.println(map);


    }
}