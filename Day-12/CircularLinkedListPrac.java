class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class CirLinkedList {
    ListNode head = null;
    void insert_at_begin(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ListNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }
    void insert_at_end(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } 
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    void delete_at_begin(){
        ListNode temp = head;
        if (head == null){
            System.out.println("CLL is Empty");
        }
        if(head.next == head){
            head = null;
        }
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head= temp.next;
    }
    void delete_at_end(){
        ListNode temp = head;
        if (head == null){
            System.out.println("CLL is Empty");
        }
        if (head.next == head){
            head = null;
        }
        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
    }
    void traversal() {
        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }
        ListNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
public class CircularLinkedListPrac {
    public static void main(String[] args) {
        CirLinkedList cll = new CirLinkedList();
        cll.insert_at_begin(10);
        cll.insert_at_begin(20);
        cll.insert_at_begin(30);
        cll.traversal();
        cll.insert_at_end(5);
        cll.traversal();
        cll.delete_at_begin();
        cll.traversal();
        cll.delete_at_end();
        cll.traversal();
    }
}
