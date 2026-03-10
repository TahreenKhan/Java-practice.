import java.io.*;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}


public class problem43 {
   public static void main(String[] args)throws IOException
   {
        DataInputStream d = new DataInputStream(System.in);
        try
        {
            System.out.println("Enter your String.");
            String s1 = d.readLine();
            System.out.println("Confirm Your Strings");
            String s2 = d.readLine();
            if(s1.equalsIgnoreCase(s2))
            {
                System.out.println("Your Strings are equal");
            }
            else
            {
                throw new MyException("Strings Mismatched");
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
   } 
}
