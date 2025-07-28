class ListNode{
     int data;
     ListNode next;
     ListNode(int data){
          this.data=data;
          this.next=null;
     }
   }
class LinkedLists{
     ListNode head;
    void traversal(){
     if(head==null){
       System.out.println("linkedlist empty");
       return;
      }
     ListNode temp=head;
     while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
     }
     System.out.println("Null");
   }
  void insert_at_begin(int data) {
   ListNode newnode=new ListNode(data);
   if(head==null){
     head=newnode;
     return;
  }
  newnode.next=head;
  head=newnode;
 }
  void insert_at_end(int data) {
	  ListNode newnode=new ListNode(data);
	  if(head==null) {
		   head=newnode;
		   return;
	  }
	  ListNode temp=head;
	   while(temp.next!=null) {
		   temp=temp.next;
	   }
	   temp.next=newnode;
	  
  }
  void sumAllNOdes() {
    if(head==null){
       System.out.println("linkedlist empty");
       return;
      }
     ListNode temp=head;
     int Sum = 0;
     while(temp!=null){
        Sum = Sum + temp.data;
        temp=temp.next;
     }
     System.out.println(Sum);
  }
  void repeating_ele(int value){
   ListNode temp = head;
   int count = 0;
   while (temp != null){
      if (temp.data == value){
         count ++;
      }
      temp = temp.next;
   }
   System.out.println("Count: " + count);
  }
  void absolute_diff(){
    if (head == null) {
        System.out.println("Linked list is empty");
        return;
    }

    int odd_sum = 0, even_sum = 0;

    ListNode odd = head;
    ListNode even = head.next;

    while (odd != null) {
        odd_sum += odd.data;
        odd = (odd.next != null) ? odd.next.next : null;

        if (even != null) {
            even_sum += even.data;
            even = (even.next != null) ? even.next.next : null;
        }
    }

    int abs_diff = Math.abs(odd_sum - even_sum);
    System.out.println("Absolute Difference: " + abs_diff);
}


}
public class SumEleLinkedList{
	public static void main(String[] args) {
		LinkedLists ob=new LinkedLists();
		  ob.insert_at_begin(4);
	      ob.insert_at_begin(2);
	      ob.insert_at_begin(3);
	      ob.insert_at_begin(2);
         ob.insert_at_begin(2);
         ob.insert_at_begin(1);
	      ob.sumAllNOdes();
         ob.repeating_ele(2);
         ob.absolute_diff();
	}

}