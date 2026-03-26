class MyTask implements Runnable
{
    public void run()
    {
        System.out.println("This Task is running.");
    }
}


public class problem50
{
    public static void main(String[] args)
    {
        MyTask task1 = new MyTask();
        Thread t1 = new Thread(task1);
        t1.start();


    }
}
