import java.io.*;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class problem42 {
    public static void main(String[] args)throws IOException{
        DataInputStream d = new DataInputStream(System.in);
        try{
            System.out.println("Enter the String");
            String input = d.readLine();

            if(input.indexOf("a")!=-1){
                System.out.println("String has a");
            }else{
                throw new MyException("String doens't have 'a'.");
            }
        }catch(MyException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
