import java.util.Scanner;
public class indexBasedOddEvenSum{
    public static void even_odd_index(int n,int arr[]){
        int even_sum = 0,odd_sum = 0;
        for(int i=0;i<n;i++){
            int num = i % 2;
            if (num == 0){
                even_sum = even_sum + arr[i];
            }
            else{
                odd_sum = odd_sum + arr[i];
            }
        }
        System.out.printf("Even Sum: %d\n",even_sum);
        System.out.printf("Odd Sum: %d\n",odd_sum);
        System.out.println(even_sum - odd_sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        even_odd_index(n,arr);
    }
}