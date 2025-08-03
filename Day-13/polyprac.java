class ListNode {
    int coeff;
    int exp;
    ListNode next;
    ListNode(int coeff, int exp) {
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
                System.out.print(temp.coeff + "x^" + temp.exp);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    void insertTermForResult(int coeff, int exp) {
    ListNode newNode = new ListNode(coeff, exp);

    if (head == null || head.exp < exp) {
        newNode.next = head;
        head = newNode;
        return;
    }

    ListNode temp = head;
    while (temp.next != null && temp.next.exp > exp) {
        temp = temp.next;
    }

    if (temp.exp == exp) {
        temp.coeff = coeff;
    } else {
        newNode.next = temp.next;
        temp.next = newNode;
    }
}


    static Polynomial sumPolynomials(Polynomial poly1, Polynomial poly2) {
        Polynomial result = new Polynomial();
        ListNode p1 = poly1.head;
        ListNode p2 = poly2.head;

        while (p1 != null && p2 != null) {
            if (p1.exp == p2.exp) {
                int sum_coeff = p1.coeff + p2.coeff;
                if (sum_coeff != 0) {
                    result.insertTermForResult(sum_coeff, p1.exp);
                }
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.exp > p2.exp) {
                result.insertTermForResult(p1.coeff, p1.exp);
                p1 = p1.next;
            } else {
                result.insertTermForResult(p2.coeff, p2.exp);
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            result.insertTermForResult(p1.coeff, p1.exp);
            p1 = p1.next;
        }
        while (p2 != null) {
            result.insertTermForResult(p2.coeff, p2.exp);
            p2 = p2.next;
        }
        return result;
    }
    static Polynomial subPolynomials(Polynomial poly1, Polynomial poly2) {
    Polynomial result = new Polynomial();
    ListNode p1 = poly1.head;
    ListNode p2 = poly2.head;

    while (p1 != null && p2 != null) {
        if (p1.exp == p2.exp) {
            int diff_coeff = p1.coeff - p2.coeff;
            if (diff_coeff != 0) {
                result.insertTermForResult(diff_coeff, p1.exp);
            }
            p1 = p1.next;
            p2 = p2.next;
        } else if (p1.exp > p2.exp) {
            result.insertTermForResult(p1.coeff, p1.exp);
            p1 = p1.next;
        } else {
            result.insertTermForResult(-p2.coeff, p2.exp);
            p2 = p2.next;
        }
    }
    while (p1 != null) {
        result.insertTermForResult(p1.coeff, p1.exp);
        p1 = p1.next;
    }
    while (p2 != null) {
        result.insertTermForResult(-p2.coeff, p2.exp);
        p2 = p2.next;
    }

    return result;
}


}

public class polyprac {
    public static void main(String[] args) {
        Polynomial poly1 = new Polynomial();
        poly1.insertTermForResult(4, 2);
        poly1.insertTermForResult(3, 1);
        poly1.insertTermForResult(2, 0);

        Polynomial poly2 = new Polynomial();
        poly2.insertTermForResult(2, 2);
        poly2.insertTermForResult(3, 1);
        poly2.insertTermForResult(2, 0);

        System.out.print("Polynomial 1: ");
        poly1.displaying();

        System.out.print("Polynomial 2: ");
        poly2.displaying();

        Polynomial sum = Polynomial.sumPolynomials(poly1, poly2);
        System.out.print("Sum: ");
        sum.displaying();

        Polynomial sub = Polynomial.subPolynomials(poly1, poly2);
        System.out.print("Sub: ");
        sub.displaying();
    }
}
