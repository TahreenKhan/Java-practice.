// Why DataInputStream.readLine() is bad
// It tries to read text lines directly from bytes, skipping proper character conversion. That’s why Java deprecated it.
// One more thing (this confuses many students)
// Scanner does all of this internally. That's why it's easier to use.

import java.io.*;

class MyOwnException extends Exception{
    public MyOwnException(String msg){
        super(msg);
    }
}

public class problem38{
    public static void main(String[] args)throws IOException{
        try{
            DataInputStream d = new DataInputStream(System.in);
            System.out.println("Enter Your Age: ");
            int a = Integer.parseInt(d.readLine());

            if(a<18){
                throw new MyOwnException("Voting Eligibity Failed.");
            }else{
                System.out.println("Eligible to Vote.");
            }
        }catch(MyOwnException e){
                e.printStackTrace();
            }
    }
}