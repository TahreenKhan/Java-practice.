// Producer-consumer problem : simplest

class Box
{
    int item;
    boolean full = false;
}
class Producer extends Thread
{
    Box box;

    Producer(Box b)
    {
        box = b;
    }
    public void run()
    {
        box.item = 10;
        box.full = true;
        System.out.println("Produced items.");
    }
}
class Consumer extends Thread
{
    Box box;
    Consumer(Box b)
    {
        box = b;
    }
    public void run()
    {
        if(box.full)
        {
            System.out.println("Item Consumed.");
        }
    }
}

public class problem55 
{
    public static void main(String[] args)
    {
        Box b = new Box();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        
        p.start();
        c.start();
    }
}
