// Static = belongs to the class. class level thing.
// Non-Static = belongs to the object. object level thing.

class Student{
    // static block
    static{
        System.out.println("This is college data");
    }

    // static variables.
    String name;
    static String college = "IIT";

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name + " Studies at "+ college);
    }

    // static method.
    static void changeCollege(String collagename){
        college = collagename;
    }

}

public class problem24 {
    public static void main(String[] args){
        Student s1 = new Student("Rahul");
        Student s2 = new Student("preeti");

        Student.changeCollege("NIT");

        s1.display();
        s2.display();
    }
}
