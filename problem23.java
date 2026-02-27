// Inner Abstract class.

class Vehicle{
    abstract class Car{
        abstract void display();
    }


    class Honda extends Car{
        void display(){
            System.out.println("This is Honda Bike");
        }
    }
}

public class problem23 {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Vehicle.Car c = v.new Honda();
        c.display();
        
        
    }
}
