// Producer-Consumer problem medium.

class Shared
{
    int data;
    boolean hasdata = false;

    synchronized void produce(int value)
    {
        data=value;
        hasdata = true;
        System.out.println("Produced data"+value);
        notify();
    }
    synchronized void consume()
    {
        while(!hasdata)
        {
            try
            {
                wait();
            }
            catch(Exception e){}
        }
        System.out.println("Consumed"+data);
        hasdata=false;
    }
}
// producer thread
class Producer extends Thread
{
    Shared s;
    Producer(Shared s)
    {
        this.s = s;
    }
    public void run()
    {
        s.produce(10);
    }
}
class Consumer extends Thread
{
    Shared s;
    Consumer(Shared s)
    {
        this.s = s;
    }
    public void run()
    {
        s.consume();
    }
}

public class problem56 
{
    public static void main(String[] args)
    {
        Shared s = new Shared();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}
