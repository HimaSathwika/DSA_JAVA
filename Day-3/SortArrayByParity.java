import java.util.*;
public class SortArrayByParity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i =0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int result[] = new int[n];
		int num =0;
		for (int i=0;i<n;i++){
		    if (arr[i] % 2 ==0){
		        result[num] = arr[i];
		        num ++;
		    }
 		}
 		for (int i=0;i<n;i++){
		    if (arr[i] % 2 ==1){
		        result[num] = arr[i];
		        num ++;
		    }
 		}
 		System.out.print(Arrays.toString(result));
	}
}