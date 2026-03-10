interface Gross{
    double TA = 5000;
    double DA = 2000.48;
    
    void gross_sal();
}
class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }

    void basic_Sal(){
        System.out.println("Name: "+name);
    } 
}
class Salary extends Employee implements Gross{
    double HRA;

    Salary(String name, double HRA){
        super(name);
        this.HRA = HRA;
    }
    void disp_sal(){
        super.basic_Sal();
        System.out.println("HRA: "+ HRA);
    }
    public void gross_sal(){
        double gross_sal = TA+DA+HRA;
        System.out.println("Gross Salary of Employee: "+ gross_sal);
    }
}


public class problem27 {
    public static void main(String[] args){
        Salary s = new Salary("Rohan", 5600);
        s.disp_sal();
        s.gross_sal();
    }
}

