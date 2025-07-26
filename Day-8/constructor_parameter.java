package oops;
class Main{
    String name;
    int roll_no;
    double marks;
    Main(String n,int r,double m){
        name = n;
        roll_no = r;
        marks = m;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll_no);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        Main ob = new Main("Hima",123,87.7);
        ob.display();
    }
}