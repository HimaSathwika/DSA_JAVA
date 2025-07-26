class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
} 
class Linkedlist{
    ListNode head;
    void traversal(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    void insert_at_begin(int data){
        ListNode newnode = new ListNode(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    void insert_at_end(int data){
        ListNode newnode = new ListNode(data);
        if (head == null){
            head = newnode;
            return;
        }
        ListNode temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    void insert_at_position(int data,int position){
        ListNode newnode = new ListNode(data);
        ListNode temp = head;
        int cur_pos = 1;
        if (position < 1){
            System.out.println("Invalid Position");
            return;
        }
        if (position == 1){
            newnode.next = head;
            head = newnode;
            return;
        }
        while(temp != null && cur_pos < position-1){
            temp = temp.next;
            cur_pos++;
        }
        if (temp == null){
            System.out.println("Out of range");
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return;
    }
    void delete_at begin(int data){
        ListNode newnode = new ListNode(data);
    }
}
public class linkedlistPos {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert_at_begin(111);
        ll.insert_at_begin(222);
        ll.insert_at_begin(333);
        ll.insert_at_end(444);
        ll.insert_at_end(555);
        ll.insert_at_position(666,3);
        ll.traversal();
    }
}
