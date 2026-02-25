class Person{
    void message(){
        System.out.println("This is Person's Class.");
    }
}
class Student extends Person{
    void message(){
        System.out.println("This is Student's Class.");
    }
    void display(){
        message();
        super.message();
    }
}

public class problem14 {
    public static void main(String[] args){
        Student S = new Student();
        S.display();
    }
}
