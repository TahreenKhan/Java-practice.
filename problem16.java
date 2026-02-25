class Super{
    int x;

    Super(int x){
        this.x = x;
    }
    void display(){
        System.out.println("The Value of Super x is: "+x);
    }
}
class sub extends Super{
    int y; 

    sub(int x, int y){
        super(x);
        this.y = y;
    }
    void display(){
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
    }
}


class problem16{
    public static void main(String[] args){
        sub S = new sub(4, 5);
        S.display();
    }
}