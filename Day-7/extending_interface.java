package oops;
interface First {
    abstract void sum(int a, int b);
}

interface Second extends First {
    abstract void mul(int a, int b);
}

interface Third extends Second {
    abstract void sub(int a, int b);
}

// Corrected: Use class to implement the interface, not another interface
class Four implements Third {
    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void mul(int a, int b) {
        System.out.println("Mul: " + (a * b));
    }

    public void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }
}

public class extending_interface {
    public static void main(String[] args) {
        Four ob = new Four();
        ob.sum(2, 3);
        ob.mul(5, 5);
        ob.sub(6, 3);
    }
}
