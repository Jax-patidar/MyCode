package MyCode;

public class Thread1and2 {
    public static void main(String[] args) {

        PC pc = new PC(20);
        new Thread(() -> {
            try {
                pc.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}

class PC
{
    int limit;
    int count =0;
    PC(int limit)
    {
        this.limit =limit;
    }

    void producer() throws InterruptedException {
        while(true && count<=limit)
        {
            synchronized (this) {

                if(count%2==0 && count<=limit)
                {
                    wait();
                }
                System.out.print( "Odd "+count+" ");
                count++;
                Thread.sleep(1000);
                notify();
            }
        }
    }

    void consumer() throws InterruptedException {
        while(true && count<=limit)
        {
            synchronized (this) {

                if(count%2==1 && count<=limit)
                {
                    wait();
                }
                System.out.print("Even "+ count+" ");
                count++;
                Thread.sleep(1000);
                notify();
            }
        }
    }
}

