package MyCode;

import java.util.*;

public class MogannStonly {

    static MogannStonly t;
    static  int count =0;
    private String K;
    private String kk;
    MogannStonly(String f)
    {
        this.K = f;
    }

    @Override
    public int hashCode()
    {
        return 13;
    }
    @Override
    protected void finalize()
    {
        count++;
        t = this;
    }

    public static void main(String[] args) {
        MogannStonly s = new MogannStonly("jadgish");
        MogannStonly s1 = new MogannStonly("patidar");

        Map<MogannStonly, String> m = new HashMap<>();
        m.put(s,"frist");
        m.put(s1,"second");
        m.put(new MogannStonly("jadgish"),"override");
        System.out.println(m.size());
        System.out.println(m.get(new MogannStonly("jadgish")));





        Integer[] a =new Integer[]{10,3,10,2,20};
        List<Integer> i = Arrays.asList(a);
        OptionalDouble av = i.stream().mapToInt(n->n*n).filter(n-> n>=10).average();
        System.out.println(av.getAsDouble());




        MogannStonly ss = new MogannStonly("Ja");
//        ss = null;
        System.gc();
//        t = null;
        System.gc();
        System.out.println(count);









    }
}



