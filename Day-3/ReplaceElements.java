import java.util.*;
public class ReplaceElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int max_ele = 0;
            for(int j=i+1;j<n;j++){
                if(max_ele < arr[j]){
                    max_ele = arr[j];
                }
                result[i] = max_ele;
            }
        }
        result[n-1] = -1;
        System.out.println(Arrays.toString(result));
    }
}