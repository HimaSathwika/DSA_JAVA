package Arrays_2D;
import java.util.*;

import String;
public class matrix_row_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[rows];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[j] = matrix[i][j];
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }

    }
}
