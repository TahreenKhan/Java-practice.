class A{
    public void mehthodA(){
        System.out.println("Method of Class A.");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Method of Class B.");
    }
}
class C extends A{
    public void methodC(){
        System.out.println("Method of Class C.");
    }
}
class D extends A{
    public void methodD(){
        System.out.println("Method of class D.");
    }
}

public class problem7 {
    public static void main(String[] args){
        B objb = new B();
        C objc = new C();
        D objd = new D();

        // all classes can access method a 
        objb.mehthodA();
        objc.mehthodA();
        objd.mehthodA();

        objb.methodB();
        objc.methodC();
        objd.methodD();
    }
}
