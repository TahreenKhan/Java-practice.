// Interface, Inheritance and Composition class in one program. 
// interface is can-do relationship, inheritance is Is-A relationship, and composition is has-a relationship

interface Printable
{
    void print();
}
class Machine
{
    void start()
    {
        System.out.println("Machine Starting");
    }
}
class Printer extends Machine implements Printable
{
    public void print(){
        System.out.println("printing Documents.");
    }
}
class Document
{
    String text = "Hello World.";
}
class Computer extends Thread
{ 
    Printer p = new Printer();
    void printDocument()
    {
        p.start();
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e){}
        
        p.print();
    }
}

public class problem57
{
    public static void main(String[] args)
    {
        Computer c = new Computer();
        c.printDocument();

    }
}