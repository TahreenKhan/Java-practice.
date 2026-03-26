// join()

class A extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("A"+i);
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("B"+i);
        }
    }
}
public class problem53
{
    public static void main(String[] args)throws Exception
    {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t1.join();    

        t2.start();
        t2.join();
        

        System.out.println("Main Thread Finished.");


    }
}