import java.io.*;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class problem41 {
    public static void main(String[] args)throws IOException{
       DataInputStream d = new DataInputStream(System.in);
       try{
       System.out.println("Enter Even Number: ");
       int a = Integer.parseInt(d.readLine());
        if(a%2==0){
            System.out.println("Wow! it's and Even Number.");
        }else{
            throw new MyException("This is not an even number.");
        }
       }catch(MyException e){
        System.out.println(e);
       }catch(IOException e){
        System.out.println(e);
       }
       }
    }

