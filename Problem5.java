class Account{
    String cust_name;
    int acc_no;

    void getdata(String n, int a){
        cust_name=n;
        acc_no=a;
    }
    
    void putdata(){
        System.out.println("Customer Info:");
        System.out.println("Name: "+cust_name);
        System.out.println("Account no.: "+acc_no);
    }
}

class SavingAcc extends Account{
    int min_bal;
    int saving_bal;

    void getdata(String n, int a, int m, int s){
        super.getdata(n,a);
        min_bal=m;
        saving_bal = s;
    }

    void putdata(){
        super.putdata();
        System.out.println("Minimum balance: "+min_bal);
        System.out.println("Saving balance: "+saving_bal);
    }

}

class Acft_Details extends SavingAcc{
    int deposits;
    int withdrawal;

    void getdata(String n, int a, int m, int s, int d, int w){
        super.getdata(n,a,m,s);
        deposits=d;
        withdrawal=w;
    }
    void putdata(){
        super.putdata();
        System.out.println("Deposit Amount: "+deposits);
        System.out.println("Withdrawal Amount: "+withdrawal);
    }
}


public class Problem5 {
    public static void main(String[] args){
        Acft_Details a = new Acft_Details();
        a.getdata("Saaduchibil", 34567, 0300, 689, 6789, 67890);
        a.putdata();
    }
}
