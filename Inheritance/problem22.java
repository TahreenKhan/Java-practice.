

abstract class Vehicle{

    String msg;
    Vehicle(String msg){
        this.msg = msg;
    }
    void print(){
        System.out.println("This was the message inside abstract class constructor: "+msg);
    }

    abstract void bike();          //abstract method
    abstract void bike(String m);  //overloaded abstract method single parameter

    void Car(){                    //non-abstract method. 
        System.out.println("Car is Running");
    }
}
class Honda extends Vehicle{

    Honda(String msg){
        super(msg);
        super.print();
    }

    void bike(){
        System.out.println("Honda Bike is Running");
    }
    void bike(String m){
        System.out.println("Overloaded parameterized abstract method: "+m);
    }
}



public class problem22 {
    public static void main(String[] args){
        Honda h = new Honda("Hello");
        h.bike();
        h.Car();
        h.bike("Hero Honda");

       
        
        
    }
}
