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
  void insert_at_middle(int data,int position) {
	  ListNode temp=head;
	  int cur_pos=1;
	  if(position<1) {
		     System.out.println("invalid position exit");
	  }
	  if(position==1) {
		  ListNode newnode=new ListNode(data);
		  newnode.next=head;
		  head=newnode;
		  return;
	  }
	  ListNode newnode=new ListNode(data);
	  while(temp!=null && cur_pos<position-1) {
		    temp=temp.next;
		    cur_pos++;
	  }
	  if(temp==null) {
		  System.out.println("position out of range");
	  }
	  newnode.next=temp.next;
	  temp.next=newnode;
 }
void delete_at_first() {
		if(head==null) {
			System.out.println("list empty");
			return;
		}
		head=head.next;
	}
void delete_at_ending() {
	ListNode temp=head,prev=null;
	if(head==null) {
		System.out.println("list empty");
	}
	if(head.next==null) {
		head=null;
		
	}
	while(temp.next!=null) {
		 prev=temp;
		 temp=temp.next;
	}
	prev.next=null;
}
	void delete_at_specific_node(int position) {
	ListNode temp=head;
	if(position<0) {
		System.out.println("list empty");
	}
	if(position==1) {
		head=head.next;
	}
	ListNode prev=null;
	int cur_pos=1;
	while(temp!=null && cur_pos<position) {
		prev=temp;
		temp=temp.next;
		cur_pos++;
	}
	if(temp==null) {
		System.out.println("position out of range");
	}
	prev.next=temp.next;
	}
	void search(int val){
    ListNode temp = head;
    int position = 1;
    boolean found = false;

    while (temp != null){
        if (temp.data == val){
            System.out.println("Element " + val + " found at position " + position);
            found = true;
            break;
        }
        position++;
        temp = temp.next;
    }

    if (!found){
        System.out.println("Element " + val + " not found");
    }
}

}
public class MenuDrivenLinkedList{
	public static void main(String[] args) {
		LinkedLists ob=new LinkedLists();
		  ob.insert_at_begin(111);
	      ob.insert_at_begin(113);
	      ob.insert_at_begin(117);
	      ob.insert_at_end(119);
	      ob.insert_at_end(115);
	      ob.traversal();
	      ob.insert_at_middle(112,2);
	      ob.insert_at_middle(379,3);
	      ob.traversal();
	      ob.delete_at_first();
	      ob.delete_at_ending();
	      ob.traversal();
	      ob.delete_at_specific_node(2);
	      ob.traversal();
		  ob.search(111);
		  ob.traversal();
	}

}