class test{
    interface Yes{
        void show();
    }
}
class testing implements test.Yes{
    public void show(){
        System.out.println("Accesses Nested Interface within Class");
    }
}

public class problem29 {
    public static void main(String[] args){
        test.Yes v = new testing();
        v.show();
    }
}
