public class problem33 {
    public static void main(String[] args){
        int a[] = new int[2];

        try{
            System.out.println("Acessed Invalid Element: "+a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }finally{
            System.out.println("This is finally block this would always get executed. ");
        }
    }
}
