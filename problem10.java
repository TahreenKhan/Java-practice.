class problem10{
    private static void add(int a, int b){
        System.out.println("Addition of 2 numbers: "+(a+b));
    }
    private static void add(int a, int b, int c){
        System.out.println("Addition of 3 numbers: "+(a+b+c));
    }
    public static void main(String[] args){
        add(5,6);
        add(10,10,10);
    }
}