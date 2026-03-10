
import java.io.*;

class MyOwnException extends Exception{
    MyOwnException(String msg){
        super(msg);
    }
}

public class problem39 {
    public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       try{
        System.out.println("Enter Positive Number: ");
        int a = Integer.parseInt(br.readLine());

        if(a>0){
            System.out.println("For Exception Enter Negative Number.");
        }else{
            throw new MyOwnException("Entered Number is Negative");
        }
       }catch(MyOwnException e){
            e.printStackTrace();
       }catch(IOException e){
            e.printStackTrace();
       }
    }
}
