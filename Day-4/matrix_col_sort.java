package Arrays_2D;
import java.util.*;

import String;
public class matrix_col_sort {
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
        for (int j=0;j<cols;j++){
            int[] temp = new int[rows];
            for (int i=0;i<rows;i++){
                temp[i] = matrix[i][j];
            }
            Arrays.sort(temp);
            for (int i=0;i<rows;i++){
                matrix[i][j] = temp[i];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
