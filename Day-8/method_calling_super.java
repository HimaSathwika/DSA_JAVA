package oops;
class First{
    int a,b;
    First(int x,int y){
        System.out.println("First class constructor");
        a = x;
        b = y;
    }
    void sum(){
        System.out.println("Sum: "+(a+b));
    }
    void sub(){
        System.out.println("Sub: "+(a-b));
    }
}
class Second extends First{
    Second(){
        super(100,200);
        super.sum();
        super.sub();
    }
}
public class method_calling_super {
    public static void main(String[] args) {
        Second ob = new Second();
    }
}