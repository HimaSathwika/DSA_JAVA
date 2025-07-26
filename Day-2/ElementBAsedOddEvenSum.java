import java.util.Scanner;
public class ElementBasedOddEvenSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int even_sum = 0,odd_sum = 0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int num = arr[i];
            if (num % 2 ==0){
                even_sum = even_sum + num;
            }
            else{
                odd_sum = odd_sum + num;
            }
        }
        System.out.printf("Even Sum: %d\n",even_sum);
        System.out.printf("Odd Sum: %d\n",odd_sum);
        System.out.println(odd_sum - even_sum);
    }
}