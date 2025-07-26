package oops;
class student{
    String name = "Sathwika";
    int roll_no = 123;
    double marks = 84.8;
    void display(String n,int r,double m){
        System.out.println("Name: "+ n);
        System.out.println("Roll no: "+r);
        System.out.println("Marks: "+m);
    }
    public static void main(String[] args) {
        student ob = new student();
        ob.display(ob.name,ob.roll_no,ob.marks); // passing values using objects
    }
}
/*class student{
    String name;
    int roll_no;
    double marks;
    void display(String n,int r,double m){
        System.out.println("Name: "+ n);
        System.out.println("Roll no: "+r);
        System.out.println("Marks: "+m);
    }
}
public class methods_with_parameters {
    public static void main(String[] args) {
        student ob = new student();
        ob.display("Sathwika",531,84.8);//ob.dispalay is method calling //passing values directly
        ob.display("Hima",33,91.3);
    }
}*/