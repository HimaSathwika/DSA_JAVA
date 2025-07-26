import java.util.Scanner;
public class ExactEqualArray{
    public static boolean mirrorArray(int n,int arr1[],int m,int arr2[]){
        boolean result = true;
        if (n == m){
            for(int i=0;i<n;i++){
                if (arr1[i] == arr2[i]){
                    result = true;
                }
                else{
                    result = false;
                    break;
                }
            }
        }
        else{
            result = false;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter array1 size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n]; 
        for(int i=0;i < n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter array2 size: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m]; 
        for(int i=0;i < m;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(mirrorArray(n,arr1,m,arr2));
    }
}