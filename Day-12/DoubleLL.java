class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList {
    ListNode head, tail;

    public void insert_at_begin(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insert_at_end(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insert_at_position(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) tail = newNode;
            return;
        }
        ListNode temp = head;
        int count = 1;
        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
    }

    public void forward_traversal() {
        if (head == null) {
            System.out.println("The DLL is empty");
            return;
        }
        ListNode temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void backward_traversal() {
        if (tail == null) {
            System.out.println("The DLL is empty");
            return;
        }
        ListNode temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void delete_at_begin() {
        if (head == null) {
            System.out.println("The DLL is empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    
    void delete_at_position(int position) {
        if (head == null) {
            System.out.println("The DLL is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } 
            else {
                tail = null;
            }
            return;
        }
        ListNode temp = head;
        int count = 1;
        while (count < position && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        if (temp.prev != null) {
           temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

}

public class DoubleLL {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert_at_begin(20);
        dll.insert_at_begin(30);
        dll.insert_at_begin(40);
        dll.insert_at_end(10);
        dll.insert_at_end(50);
        dll.insert_at_position(15, 3);
        dll.forward_traversal();
        dll.backward_traversal();
        dll.delete_at_begin();
        dll.delete_at_position(3);
        dll.forward_traversal();
        dll.backward_traversal();
    }
}