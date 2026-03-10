interface Sports{
    int sport_wt = 5;
    public void disp();
}
class Test{
    int roll_no;
    String name;
    int m1, m2;

    Test(int r, String n, int m1, int m2){
        roll_no = r;
        name = n;
        this.m1 = m1;
        this.m2 = m2;
    }
}
class Result extends Test implements Sports{
    Result(int r, String n, int m1, int m2){
        super(r, n, m1, m2);
    }
    public void disp(){
        System.out.println("Roll no.: "+ roll_no);
        System.out.println("Name: "+ name);
        System.out.println("Sub1: "+m1);
        System.out.println("Sub2: "+m2);
        System.out.println("sport Weight: "+ sport_wt);

        int t = m1+m2+sport_wt;
        System.out.println("Total: "+ t);

    }
}



public class problem26 {
    public static void main(String[] args){
        Result r = new Result(45, "Harsh", 2, 4);
        r.disp();
    }
}
