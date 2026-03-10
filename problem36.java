// static method belong to class and non static method belong to object.

public class problem36{
    
    public static void method1(){
        try{
            int num1=4, num2=0;
            int output = num1/num2;
            System.out.println("Result: "+output);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide number by Zero.");
        }
    }
    
    public static void method2(){
        try{
            int[] arr = new int[5];
            arr[8] = 9;    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception");
        }
    }
    public static void method3(){
        try{
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format Exception has occured.");
        }
    }
    public static void method4(){
        try{
            String s = "BeginnersBook";
            System.out.println(s.length());
            char c = s.charAt(0);
            System.out.println(c);
            c = s.charAt(40);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e ){
            System.out.println("String Index Out Of Bound Exception.");
        }
    }
    
    public static void method5(){
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception.");
        }
    }

    int division(int a , int b) throws ArithmeticException
    {
        int t = a/b;
        return t;
    }

    static void CheckEligibility(int stuage, int stuweight){
        if(stuage<12 && stuweight<40){
            throw new ArithmeticException("The Student is not Eligible.");
        }else{
            System.out.println("Student is Eligible.");   
        }
    }

    public static void main(String[] args){
        method1();
        method2();
        method3();
        method4();
        method5();

        // problem36 d = new problem36();
        // System.out.println(d.division(5, 0));

        CheckEligibility(40, 100);
        CheckEligibility(3, 10);
    }
}

   
