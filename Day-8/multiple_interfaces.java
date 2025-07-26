package oops;
interface First{
    abstract void display();
}
interface Second{
    abstract  void display();
}
interface Third{
    abstract void display();
}
class Four implements First,Second,Third{
    public void display(){
        System.out.println("Multiple inheritance");
    }
}
public class multiple_interfaces {
    public static void main(String[] args) {
        Four ob = new Four();
        ob.display();
    }
}
