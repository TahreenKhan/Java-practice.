class Sample{
    int addition(int i, int j){
        return i+j;
    }
    String addition(String s1, String s2){
        return s1+s2;
    }
    double addition(double d1, double d2){
        return d1+d2;
    }
}

public class problem8{
    public static void main(String[] args){
        Sample s = new Sample();
        System.out.println(s.addition(4,5));
        System.out.println(s.addition("Hello","World"));
        System.out.println(s.addition(4.4,5.6));

    }
}