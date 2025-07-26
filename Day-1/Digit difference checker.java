import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int rev_num =0 ;
        while(num > 0){
            int digit = num % 10;
            rev_num = rev_num * 10 + digit;
            num = num / 10;
        }
        int num1 = rev_num % 10;
        rev_num = rev_num / 10;
        int n = num1;
        while(rev_num > 0){
            int digit = rev_num % 10 ;
            int diff = Math.abs(n - digit);
            num1 = num1 * 10 + diff;
            rev_num = rev_num / 10;
            n = digit;
        }
        System.out.println(num1);
    }
}