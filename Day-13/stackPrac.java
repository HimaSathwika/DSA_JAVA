class ListNode{
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class stack{
    ListNode top;
    void push(int data) {
        ListNode newNode = new ListNode(data);
        if (top == null) {
            top = newNode;
            newNode.next = top;
        } 
        ListNode temp = top;
        while (temp.next != top) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = top;
    }
    void pop(){
        ListNode temp = top;
        if (top == null){
            System.out.println("Stack is Empty");
        }
        if (top.next == top){
            top = null;
        }
        while(temp.next.next != top){
            temp = temp.next;
        }
        temp.next = top;
    }
    void traversal() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        ListNode temp = top;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != top);
        System.out.println();
    }
}
public class stackPrac {
    public static void main(String[] args){
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.traversal();
        st.pop();
        st.traversal();
        st.push(15);
        st.push(20);
        st.traversal();
    } 
}
