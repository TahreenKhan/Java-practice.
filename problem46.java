import java.io.*;

class lengthException extends Exception
{
    lengthException(String msg)
    {
        super(msg);
    }
}


public class problem46 
 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = new String();
        try
        {
            System.out.println("Enter String of length greater than 6: ");
            s1 = br.readLine();

            if(s1.length()>6)
            {
                System.out.println(s1.toUpperCase());
            }
            else
            {
                throw new lengthException("Length of String is greater than 6 is not accepted.");
            }
        }
        catch(lengthException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
 }   

