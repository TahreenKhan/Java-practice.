class Vehicle{
    int maxSpeed = 120;
}
class Car extends Vehicle{
    int maxSpeed = 180;

    void display(){
        System.out.println("The maximum speed is:"+ super.maxSpeed);
    }
}
public class problem13 {
    public static void main(String[] args){
       Car c = new Car();
       c.display();

    }
}
