abstract class A{

    abstract void display();

    void show(){
        System.out.println("This is not abstract method.");
    }
}
class B extends A{

    void display(){
        System.out.println("Applied compulsory abstract conditon of display method in B");
    }
}


public class problem19 {
    public static void main(String[] arg){
        B b = new B();
        b.display();
        b.show();
    }
}
