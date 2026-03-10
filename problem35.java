public class problem35 {
    public static void main(String[] args){

        try{
            int[] a = {3,4,0,2,5};

            try{
                int x = a[3]/a[2];
            }catch(ArithmeticException e){
                System.out.println("Cannot divide by Zero.");
            }

            a[8] = 3;
            
        }   
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out of Bound Exception");
            }
        
    }
}


