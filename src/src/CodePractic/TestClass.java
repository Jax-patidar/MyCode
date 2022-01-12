package CodePractic;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestClass implements Runnable{
    String threadName;
    int number;
    TestClass(String threadName, int number){
        this.threadName = threadName;
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(this.threadName+"   "+this.number);
    }

    public static void main(String[] args) {
        int number = 10;
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Functionality t1 = new Functionality(number);
        ex.submit(() -> {
            try {
                t1.getFirst();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        ex.submit(() -> {
            try {
                t1.getSecond();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ex.submit(() -> {
            try {
                t1.getSecond();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


    }
}


class Functionality
{
    int limit;
    int counter =0;
    Functionality(int limit)
    {
        this.limit=limit;
    }
    void getFirst() throws InterruptedException {
        while(true)
        {
            synchronized (this)
            {
                if(counter%2==0&& counter < limit)
                {
                    wait();
                }
                Thread.sleep(1000);
                System.out.print(" odd "+counter+"  ");
                counter++;
                notify();
            }
        }

    }

    void getSecond() throws InterruptedException {
        while(true)
        {
            synchronized (this)
            {
                if(counter%2==1 && counter < limit)
                {
                    wait();
                }
                Thread.sleep(1000);
                System.out.print(" Even "+counter+"  ");
                counter++;
                notify();
            }
        }

    }

}









// two thing./
//Name thred name , int