import java.io.*;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class problem40{
    public static void main(String[] args)throws IOException{
        DataInputStream d = new DataInputStream(System.in);
        String s1 = new String();
        String s2 = new String();
        try{
            System.out.println("Enter Password: ");
            s1 = d.readLine();
            System.out.println("Confirm Password: ");
            s2 = d.readLine();

            if(s1.equals(s2)){
                System.out.println("Password Matched Successfully!");
            }else{
                throw new MyException("Password Mismatched!");
            }
        }catch(MyException e){
            e.printStackTrace();
        }
        catch(IOException e ){
            e.printStackTrace();
        }
    }
}