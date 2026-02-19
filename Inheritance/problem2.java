// constructor
//Constructors are not members, so they are not inherited by subclasses, but he constructor of the superclass can be invoked from the subclass. 
// import java.lang.*; java imports it by default.
// If a value:
// is constant → final
// is universal → static final
// is mathematical → use Math.PI and stop inventing nonsense 

// Decimal literal → double like 3.14 is float but no. after decimal are double in java not float. 
// float needs f or cast .. we write 3.14f to show the decimals are float not double. 
// Math.PI → double only... we use it for pi value. 

class Sphere{
    int r;

    Sphere(int r){
        this.r = r;
    }

    void volume(){
        double v = (4*Math.PI*r*r)/3;
        System.out.println("Volume of Sphere is: "+v);
    }
}

class Hemisphere extends Sphere{
    int a;

    Hemisphere(int r, int a){
        super(r);
        this.a=a;
    }
    
    void volume(){
        super.volume();
        double v = (a*Math.PI*r*r*r)/3;
        System.out.println("Volume of Hemisphere: "+v);
    }

}

public class problem2{
    public static void main(String[] args){
        Hemisphere h = new Hemisphere(12, 2);
        h.volume();
    }
}