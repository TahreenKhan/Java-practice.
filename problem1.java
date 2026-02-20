//Simple Inheritance. 

class Calculation{
    
    int z;
    
    public void addition(int x, int y){
        z = x+y;
        System.out.println("The Sum of given number is: "+z);
    }

    public void subtraction(int x, int y){
        z = x-y;
        System.out.println("The Subtraction of the given number is: "+z);
    }

}

class MyCalculation extends Calculation{
     public void muliplication(int x, int y){
        z = x*y;
        System.out.println("The Multiplication of given number is: "+z);
     }
}

public class problem1 {
    public static void  main(String[] args){
        MyCalculation demo = new MyCalculation();
        demo.addition(5,5);
        demo.subtraction(5, 5);
        demo.muliplication(5, 5);
    }
}
