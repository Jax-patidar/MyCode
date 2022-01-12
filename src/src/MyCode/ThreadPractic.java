package MyCode;

public class ThreadPractic {
    static int k;
    int count = 0;
    public  void even() throws InterruptedException {

//        synchronized (this)
//        {
            while(count<k)
            {
                while(count%2==0)
                {
                   // wait();
                    Thread.sleep(1000);
                }
                count++;
                System.out.println(count + " hread-1");
                //notify();
            }
//        }


    }
    public  void odd() throws InterruptedException {

//        synchronized (this)
//        {

            while(count<k)
            {
                while(count%2==1)
                {
                    //wait();
                    Thread.sleep(1000);
                }
                count++;
                System.out.println(count + " hred-2");

            }
        //}


    }




    public static void main(String[] args) throws InterruptedException {
        k=10;
        ThreadPractic obj =  new ThreadPractic();

       Thread t1 = new Thread(() -> {
           try {
               obj.even();
           } catch (InterruptedException e)   {
               e.printStackTrace();
           }
       });

        Thread t2 = new Thread(() -> {
            try {
                obj.odd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        //t1.join();
        t2.start();


    }

}

//class MyThead extends Thread
//{
//
//
//  public void run() {
//
//  }
//
//
//}