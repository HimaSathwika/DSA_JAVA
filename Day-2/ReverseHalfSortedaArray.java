import java.util.*;
public class ReverseHalfSortedaArray
{
    public static void sortNum(int n,int arr[]){
        int mid = n / 2;
        for(int i=0;i<mid-1;i++){
            for(int j=i+1;j<mid;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
		    arr[i] = sc.nextInt();
		}
		sortNum(n,arr);
	}
}
