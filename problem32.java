public class problem32{
    public static void main(String[] args) {
        
        int a[] = new int[2];
        System.out.println("try out");

        try{
            System.out.println("Acceess invalid element"+a[3]);
        }finally{
            System.out.println("Finally is executing.");
        }
    }
}

// the above program will throw ArrayindexOutOfBoundException. but finally would always be exected even without erro handling catch method. 