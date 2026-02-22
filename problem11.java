public class problem11 {
    private static void display(int a){
        System.out.println("Display Integer Data: "+ a);
    }
    private static void display(String a){
        System.out.println("Display String object: "+ a);
    }
    
    public static void main(String[] args){
        display(1);
        display("Hello");
    }
}
