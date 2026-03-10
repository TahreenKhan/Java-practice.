import java.io.*;

class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}


public class problem44 {
    public static void main(String[] args)throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {   
            System.out.println("Enter Your Age to check voter Eligibility:");
            int age = Integer.parseInt(br.readLine());

            if(age<18)
            {
                throw new MyException("You are not Eligible to vote!");
            }
            else
            {
                System.out.println("You are Eligible to Vote!");
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
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
