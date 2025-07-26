import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean count = true;
        int digit = num % 10 ;
        num = num / 10 ;
        while(num > 0){
            int digit1 = num % 10;
            int diff = Math.abs(digit - digit1);
            if (diff == 1){
                count = true;
            }
            else{
                count = false;
                break;
            }
            digit = digit1;
            num = num / 10;
        }
        if (count){
            System.out.println("Jumping Number");
        }
        else{
            System.out.println("No");
        }
    }
}