import java.util.*;
public class SortedArraySquares{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            result[i] = (int)Math.pow(arr[i],2);
        }
        System.out.println(Arrays.toString(result));
    }
}