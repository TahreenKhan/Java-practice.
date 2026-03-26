// sleep

class A extends Thread
{
    public void run()
    {
        for(int i=0; i<=5;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
        }
    }
}
public class problem52
{
    public static void main(String[] args)
    {
        A t1 = new A();
        t1.start();
    }
}
