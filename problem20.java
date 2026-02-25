abstract class Employee{

    int emp_id;
    String emp_name;

    Employee(int e, String n){
        emp_id = e;
        emp_name = n;
    }
    void display(){
        System.out.println("Employee Id: "+emp_id);
        System.out.println("Employee name: "+emp_name);
    }
}
class Manager extends Employee{

    int mid;   //Manager Id.
    String mname;
    int phno; 

    Manager(int e, String n, int m, String mn, int p){
        super(e,n);
        mid = m;
        mname = mn;
        phno = p;
    }
    void display(){
        super.display();
        System.out.println("Manager ID: "+mid);
        System.out.println("Manager Name: "+mname);
        System.out.println("Manager ID: "+phno);
    }
}
class Worker extends Employee{
     
    int id;
    String name;
    int whours;

    Worker(int e, String n, int id, String wn, int h){
        super(e, n);
        this.id = id;
        name = wn;
        whours = h;
    }
    void display(){
        super.display();
        System.out.println("Worker ID: "+id);
        System.out.println("Worker Name "+name);
        System.out.println("Worker Working Hours: "+whours);
    }
}

public class problem20 {
    public static void main(String[] arg){
        Manager m = new Manager(7890, "Saad kazi", 8907, "Saad", 90856743);
        Worker w = new Worker(7899, "saaduchibil", 98076, "Tahreen", 9);

        m.display();
        System.out.println();
        w.display();
    }
}
