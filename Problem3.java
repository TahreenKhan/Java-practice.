// class : person,
// name, age
// class: Employee,
// emp_desination, emp_salary. 

class Person{
    String name;
    int age;

    void getdata(String n, int a){
        name = n;
        age = a;
    }
    
    void putdata(){
        System.out.println("Employee details:");
        System.out.println("Employee name: "+name);
        System.out.println("Employee Age: "+age);
    }
}

class Employee extends Person{
    String emp_designation;
    int emp_salary;

    void getdata(String n, int a, String d, int s){
        super.getdata(n,a);
        emp_designation = d;
        emp_salary = s;
    }

    void putdata(){
        super.putdata();
        System.out.println("Employee Designation: "+emp_designation);
        System.out.println("Employee Salary: "+ emp_salary);
    }
}


public class Problem3{
    public static void main(String[] args){
        Employee e = new Employee();
        e.getdata("saad", 14, "Manager", 45000);
        e.putdata();
    }
}
