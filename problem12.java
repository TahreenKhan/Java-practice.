// this() → calls another constructor of the SAME class-connects constructor-constructor.
// super() → calls constructor of the PARENT class, connects child-parent
// Common rules (same for both — Java is strict, not polite)
// Must be the first line in the constructor
// You can use only one of them
// ❌ this(); super(); → illegal, Java will explode


public class problem12 {
    
    private int rollno;

    // default constructor.
    problem12(){
        rollno = 100;
    }

    // Parameterized constructor showcasing the use of this().
    problem12(int n){
        this();
        rollno = rollno + n;
    }

    public int getrollno(){
        return rollno;
    }

    public void setrollno(int rollno){
        this.rollno = rollno;
    }


    public static void main(String[] args){
        problem12 p = new problem12(10);
        System.out.println(p.getrollno());
        p.setrollno(800);
        System.out.println(p.getrollno());

    }

}
