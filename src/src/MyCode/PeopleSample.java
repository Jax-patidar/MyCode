package MyCode;

import org.apache.groovy.json.internal.ArrayUtils;
import org.codehaus.groovy.runtime.ArrayUtil;

import java.lang.reflect.Array;
import java.util.*;

public class PeopleSample {
    public static void main(String[] args) {

        int []a = {1,3,8,10};
        int []b = {2,4,6,7};

        int size = a.length+b.length;
        int res[] = new int[size];
        int aa = 0;
        int bb = 0;
        for (int i = 0; i < size; i++) {
            if(aa < a.length && bb < b.length)
            {
                if(a[aa] < b[bb])
                {
                    res[i]=a[aa];
                    aa++;
                }else
                {
                    res[i]=b[bb];
                    bb++;
                }
            }else if (aa < a.length)
            {
                res[i] = a[aa];

                aa++;
            } else if (bb < b.length)
            {
                res[i] = b[bb];
                bb++;
            }
        }

        for (int r:res)
        {
            System.out.print( r + " ");
        }
    }
}
