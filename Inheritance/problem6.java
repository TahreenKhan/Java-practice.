import java.util.Scanner;

abstract class Shape{
    float dim1, dim2;

    Scanner sc = new Scanner(System.in);

    void getdata(){
        System.out.println("Enter the value of dimension 1: ");
        dim1 = sc.nextFloat();
        System.out.println("Enter the value of dimension 2: ");
        dim2 = sc.nextFloat();
        
    }
    void display(){
        System.out.println("Dimension-1: "+dim1);
        System.out.println("Dimension-2: "+dim2);
        
    }
    abstract void area();
}

class Rectangle extends Shape{

    Rectangle(){
        System.out.println("-".repeat(20));
        System.out.println("-----------RECTANGLE----------");
    }

    void area(){   
        double area = dim1*dim2;
        System.out.println("Area of Rectangle is: "+area);
    }
}
class Triangle extends Shape{

    Triangle(){
        System.out.println("-".repeat(20)
    );
        System.out.println("-----------Triangle----------");
    }

    void area(){
        
        double area = 0.5*dim1*dim2;
        System.out.println("Area of Triangle is: "+area);
    }
}

public class problem6{
    public static void main(String[] args){
        Shape s = new Rectangle();
        s.getdata();
        s.display();
        s.area();

        s = new Triangle();
        s.getdata();
        s.display();
        s.area();
    }
}