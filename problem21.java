import java.io.*;

abstract class Shape{

    float dim1;
    float dim2;

    void getdata()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of dimension-1: ");
        dim1 = Float.parseFloat(br.readLine());
        System.out.println("Enter the value of dimension-2: ");
        dim2 = Float.parseFloat(br.readLine());
    }
    void display(){
        System.out.println("Dimension-1: "+dim1);
        System.out.println("Dimension-2: "+dim2);
    }

    abstract void area();

}
class Rectangle extends Shape{
    

    void getdata()throws IOException
    {
        super.getdata();
    }

    void area(){
        double area = dim1*dim2;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Triangle extends Shape{
    

    void getdata()throws IOException
    {
        super.getdata();
    }

    void area(){
        double area = 0.5*dim1*dim2;
        System.out.println("Area of Recttangle is: "+area);
    }
}

public class problem21{
    public static void main(String[] args)throws IOException{
        Rectangle r = new Rectangle();
        System.out.println("Rectangle: \n");
        r.getdata();
        r.display();
        r.area();
        
        Triangle t = new Triangle();
        System.out.println("Triangle:");
        t.getdata();
        t.display();
        t.area();
    }
}