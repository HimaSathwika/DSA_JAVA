package oops;
class constructor1{
    String name;
    int roll_no;
    double marks;
    void display(){
        System.out.println("Name: "+name + "\nRoll No: "+roll_no + "\nMarks: "+ marks);
    }
    constructor1(){
        name = "Sathwika";
        roll_no = 123;
        marks = 84.8;
        System.out.println("Hello");
    }
}
public class constructor {
    public static void main(String[] args) {
        constructor1 ob = new constructor1();
        ob.display();
    }
}
