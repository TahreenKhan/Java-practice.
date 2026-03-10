// args = external arguments passed while launching.
// Scanner = user typing live.
// BufferedReader = faster, manual parsing required.
// parseInt() = only needed when input is String.

public class problem34{
    public static void main(String[] args){
        System.out.println("Execution Starts heres");
        int a, b, c;
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a/b;
            System.out.println("Answer of Division is: "+c);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("finally would run no matter what");
        }
        System.out.println("This is directly inside main function if error occur occurs this won't run , but if handled it would. ");
    }
}