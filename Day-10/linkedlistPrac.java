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
}
public class linkedlistPrac {
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        ll.insert_at_begin(111);
        ll.insert_at_begin(222);
        ll.insert_at_begin(333);
        ll.insert_at_end(444);
        ll.insert_at_end(555);
        ll.traversal();
    }
}
