class Stack {
    int top;
    int size;
    int[] stack;

    Stack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new int[size];  
    }

    void push(int ele) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = ele;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        int temp = stack[top];
        top--;
        System.out.println("Popped: " + temp);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class stacks {
    public static void main(String[] args) {
        Stack s = new Stack(5);  
        s.push(10);
        s.push(30);
        s.push(40);
        s.push(20);
        s.display(); 
        s.pop();      
        s.display(); 
        s.peek();
    }
}
