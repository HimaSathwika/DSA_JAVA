import java.util.Scanner;
public class MirrorArray{
    public static boolean mirrorArray(int n,int arr[]){
        int mid = 0;
        mid = n / 2;
        boolean result = true;
        if (n % 2 !=0){
            result = false;
        }
        else{
            for(int i=0;i<mid;i++){
                if(arr[i] != arr[n-1-i]){
                    result = false;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mirrorArray(n,arr));
    }
}