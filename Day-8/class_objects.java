package oops;
/*class student1 {
    String name;
    int roll_no;
    double marks ;
    void display(){
        System.out.println(name+" "+roll_no+" "+marks);
    }
}
public class class_objects{
    public static void main(String[] args){
        student1 s1 = new student1();
        s1.name = "Sathwika";
        s1.roll_no = 531;
        s1.marks = 84.8;
        s1.display();
    }
}*/
class student2{
    static String name = "Hima";
    static int roll_no = 11;
    static double marks = 91.3;
    static void display(){
        System.out.println(name+" " + roll_no +" " + marks);
    }
}
public class class_objects{
    public static void main(String[] args) {
        student2  s1 = new student2();
        student2.display();
        System.out.println(student2.name);
    }
}