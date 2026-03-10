import java.io.IOException;

public class problem31{
    public static void main(String[] args) throws Exception{
        int n1 = 10;
        int n2 = 10;
        if(n1>n2){
            throw new IOException("n1 is greater.");
        }else{
            System.out.println("n2 is greater");
        }
    }
}