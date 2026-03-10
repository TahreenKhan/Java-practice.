import java.io.*;

class MyOwnException extends Exception
{
    MyOwnException(String msg)
    {
        super(msg);
    }
}

public class problem45
{
        public static void main(String[] args)throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try
            {
               System.out.println("Enter Your Valid Email-Id: "); 
               String s = br.readLine();

               if(s.contains("@") && s.contains(".") && s.indexOf("@")>0 && s.indexOf(".")>s.indexOf("@") && !Character.isDigit(s.charAt(0)))
               {
                    System.out.println("Valid Email!");
               }
               else
               {
                    throw new MyException("Invalid Email");
               }
            }catch(MyException e)
            {
                System.out.println(e);
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }    
}
