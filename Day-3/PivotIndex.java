import java.util.*;
public class PivotIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        int t_Sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i:arr){
            t_Sum += i;
        }
        int l_sum = 0,index= 0;
        for(int i =0;i<n;i++){
            if (l_sum == t_Sum - l_sum - arr[i]){
                index = i;
            }
            l_sum += arr[i];
        }
        if(index>0){    
            System.out.println(index);
        }
        else{
            System.out.println("No pivot index");
        }
    }
}