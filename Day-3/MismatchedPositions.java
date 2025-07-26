import java.util.*;
public class MismatchedPositions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = arr[i];
        }
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] != result[i]){
                count ++;
            }
        }
        System.out.println(count);
    }
}