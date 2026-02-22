class Overload{
    void test(int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a & b: "+a+ " and "+b);
    }
    double test(double a){
        System.out.println("Double a: "+a);
        return a*a;
    }
}

public class problem9{
    public static void main(String[] args){
        Overload O = new Overload();
        O.test(3);
        O.test(6,6);
        System.out.println(O.test(1.2));
    }
}