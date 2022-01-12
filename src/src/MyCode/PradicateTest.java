package MyCode;


import java.util.function.Predicate;

public class PradicateTest
{
    static boolean fun( String name, Predicate<String> checker )
    {
        if ( checker.test( name ) ) {
            return true;

        } else
            return false;
    }


    public static void main( String args[] )
    {

        String name = "Dahjiraj";
        System.out.println( fun( name, x -> x.charAt( 0 ) == 'D' ) );

        Predicate<Integer> checker = x -> x>10?true:false;
        System.out.println(checker.or(x -> x<15?true:false).test(14));
        System.out.println(checker.or(x -> x<15?true:false).test(14));

    }
}
