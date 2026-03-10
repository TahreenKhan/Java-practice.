class Person{
    Person(){
        System.out.println("This is Person's class.");
    }
}
class Student extends Person{
    Student(){
        super();
        System.out.println("This is Students class constructor");
    }
}
public class problem15 {
    public static void main(String[] args){
        Student S = new Student();
        // the print statment is in the constructor itself thus no need to call any method. 
    }
}
