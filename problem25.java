// Interface.
// Interface cannot be instantiated. i.e can't make object of it.
// Interface variables are always constant. everyvaraible is public static final int x = 10;

interface Shape{
    abstract void display();
}
class Circle implements Shape{
    public void display(){
        System.out.println("This is Circle.");
    }
}

interface One{
    int x = 10;
}
interface Two{
    int y = 20;
    void display();
}
class Demo implements One, Two{
    public void display(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("x+y: "+ (x+y));
    }
}

public class problem25 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.display();

        Demo d = new Demo();
        d.display();
    }
    
}
