package CodePractic;

import kotlin.jvm.Volatile;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Program10 {
    public static void main(String[] args) {
        int capcity = 3;
        BlockingQueue<Integer> bq =  new ArrayBlockingQueue<>(capcity);
        ThreadProdCons threadProdCons = new ThreadProdCons(capcity,bq);
        Thread t1 = new Thread( () -> {
            try {
                threadProdCons.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread( () -> {
            try {
                threadProdCons.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.start();
        t1.start();



//        bq.add("jagdish");
//        bq.add("Patidar");
//
//        bq.add("Tejra");
//        System.out.println(bq);
    }
}

class ThreadProdCons
{
    int capcity;
    BlockingQueue<Integer> bq;
    int count = 0;
    ThreadProdCons(int capcity, BlockingQueue<Integer> bq)
    {
        this.capcity = capcity;
        this.bq = bq;
    }
    public void consumer() throws InterruptedException {
        synchronized (this)
        {
            if(bq.size()==0)
            {
               wait();
            }

            System.out.println("consumer: "+bq.poll());
            Thread.sleep(1000);
            notify();

        }

    }

    public void producer() throws InterruptedException {

        synchronized (this)
        {
            if(bq.size()>=capcity)
            {
                wait();
            }

            System.out.println("consumer: "+count);
            bq.add(count++);
            Thread.sleep(1000);
            notify();

        }
    }
}
