class A extends Thread
{
    public void run()
    {
        for(int i=0; i<=5; i++)
        {
            System.out.println(i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0; i<=5; i++)
        {
            System.out.println(i);
        }
    }
}
class C extends Thread
{
    public void run()
    {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}



public class problem51 
{
    public static void main(String[] args)
    {
        A t1 = new A();
        B t2 = new B();

        System.out.println();
        t1.start();
        System.out.println();
        t2.start();
    }
}
