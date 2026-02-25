class A{
    void show(){
        System.out.println("In Show of A");
    }
}

class B extends A{

    @Override
    void show(){
        System.out.println("In show of B");
    }
}
class C extends B{
    @Override
    void show(){
        System.out.println("In show of C");
    }

}


public class problem18 {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        A r;     // base class reference

        r=a;
        r.show();  //calls A.show();

        r=b;
        r.show();  //calls B.show();

        r=c;
        r.show();   //calls C.show();
    }
}


