interface Display{
    void show();
    
    interface Message{
        int digit = 10;
        void msg();
    }
}

class test implements Display.Message{
    public void msg(){
        System.out.println("This is nested interface constant variable assignned digit: "+digit);
        System.out.println("Accessed Nested interface");
    }
}

public class problem28 {
    public static void main(String[] args){
        Display.Message m = new test();
        m.msg();
    }
}
