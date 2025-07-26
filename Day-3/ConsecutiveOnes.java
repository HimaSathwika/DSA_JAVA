import java.util.*;
public class ConsecutiveOnes{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int max_count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count ++;
                if(max_count < count){
                    max_count = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.print(max_count);
    }
}