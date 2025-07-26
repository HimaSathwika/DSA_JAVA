package oops;
interface First{
    abstract void display();
    abstract void print();
}
class Second implements First{
    public void display(){
        System.out.println("First Method");
    }    
    public void print(){
        System.out.println("Second Method");
    }
}
public class interface_example {
    public static void main(String[] args) {
        Second ob = new Second();
        ob.display();
        ob.print();
    }
}