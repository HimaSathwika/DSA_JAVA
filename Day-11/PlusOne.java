class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public ListNode plusOne(ListNode head) {
        head = reverse(head);
        ListNode cur = head;
        int carry = 1;

        while (cur != null && carry > 0) {
            int sum = cur.data + carry;
            cur.data = sum % 10;
            carry = sum / 10;

            if (cur.next == null && carry > 0) {
                cur.next = new ListNode(0);
            }

            cur = cur.next;
        }

        return reverse(head);
    }
}

public class PlusOne {
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(9);

        Solution ob = new Solution();
        ListNode result = ob.plusOne(head);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
