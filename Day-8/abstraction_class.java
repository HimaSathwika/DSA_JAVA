package oops;
abstract class First{
    abstract void sum(int a,int b);
    abstract void mul(int a,int b);
}
abstract class Second extends First{
    void sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    abstract void mul(int a,int b);
}
class Third extends Second{
    void mul(int a,int b){
        System.out.println("Mul: "+(a*b));
    }
}
public class abstraction_class {
    public static void main(String[] args) {
        Third ob = new Third();
        ob.sum(100,200);
        ob.mul(2,3);
    }
}
