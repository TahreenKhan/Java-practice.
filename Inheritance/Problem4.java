// class: Square
// length, area{}
// class: rectangle
// breadth , rectarea()
// class: box
// height , volume 

class Square{
    int length;
    
    Square(int l){
        length=l;
    } 
    
    void area(){
        int area = length*length;
        System.out.println("Area of Square is: "+area);
    }
}

class Rectangle extends Square{
    int breadth;

    Rectangle(int l, int b){
        super(l);
        breadth = b;
    }

    void rectArea(){
        int area = length*breadth;
        System.out.println("Area of Rectangle is: "+area);
    }
}

class Box extends Rectangle{
    int height;

    Box(int l, int b, int h){
        super(l,b);
        height = h;
    }

    void volume(){
        int vol = length*breadth*height;
        System.out.println("Volume of Box: "+vol);
    }
}


public class Problem4{
    public static void main(String[] args){
        Box b = new Box(5, 5, 5);
        b.area();
        b.volume();
        b.rectArea();
    }
}