package oops;
abstract class First {
    int a, b;

    First(int x, int y) {
        a = x;
        b = y;
    }

    void sum() {
        System.out.println(a + b);
    }
    
}

class Second extends First {
    Second() {
        super(15, 15);    
    }
    void sub() {
        System.out.println(a - b);
    }
    void mul() {
        System.out.println(a * b);
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Second s = new Second();
        s.sum(); 
        s.sub();
        s.mul();
    }
}
