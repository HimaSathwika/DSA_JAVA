class ListNode {
    int coeff;
    int exp;
    ListNode next;
    ListNode(int coeff,int exp) {
        this.coeff = coeff;
        this.exp = exp;
        this.next = null;
    }
}

class Polynomial {
    ListNode head;

    void displaying() {
        if (head == null) {
            System.out.println("0");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            if (temp.coeff != 0) {
                if (temp.coeff > 0 && temp != head) {
                    System.out.print("+");
                }
                System.out.print(temp.coeff + "X^" + temp.exp);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    void insertPolynomial(int coeff, int exp) {
        ListNode newNode = new ListNode(coeff, exp);
        if (head == null || head.exp < exp) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null && temp.exp > exp) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null && temp.exp == exp) {
            temp.coeff += coeff;
            if (temp.coeff == 0) {
                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }
            }
            return;
        }
        newNode.next = temp;
        if (prev != null) {
            prev.next = newNode;
        } else {
            head = newNode;
        }
    }
}

public class polyprac {
    public static void main(String[] args) {
        Polynomial ob = new Polynomial();
        ob.insertPolynomial(4, 3);
        ob.insertPolynomial(2, 1);
        ob.insertPolynomial(5, 5);
        ob.displaying();
    }
}
