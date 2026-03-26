// print in sequence. 

class myThread1 implements Runnable
{
    public void run()
    {
        System.out.println("Prints A");
    }
}

class myThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Prints B");
    }
}
class myThread3 implements Runnable
{
    public void run()
    {
        System.out.println("prints C");
    }
}

class practice
{
    public static void main(String[] args)
    {
        
        Thread t1 = new Thread(new myThread1());
        Thread t2 = new Thread(new myThread2());
        Thread t3 = new Thread(new myThread3());

        t1.start();
        t2.start();
        t3.start();

    }
}