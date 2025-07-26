package oops;
class Student{
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class encapsulation {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Ananth");
        System.out.println(s.getName());
    }
}
