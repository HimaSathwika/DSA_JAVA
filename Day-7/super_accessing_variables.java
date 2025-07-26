package oops;
//Super class variables accessing
class First{
    int a = 10;
    First(){
        System.out.println("First class constructor");
    }
}
class Second extends First{
    int a = 15;
    Second(){
        System.out.println("Second class constructor");
    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(a*super.a);
    }
}
public class super_accessing_variables {
    public static void main(String[] args) {
        Second ob = new Second();
        ob.display();
    }
}
