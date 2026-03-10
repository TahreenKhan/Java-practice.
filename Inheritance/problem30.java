class problem30{
    public static void main(String[] args){
        try{
            int a = 8;
            int b = a/0;
            System.out.println("Answer: "+b);
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero");
        }
    }
}