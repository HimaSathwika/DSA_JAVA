package Arrays_2D;
import java.util.*;

import String;
public class row_reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            int left =0;
            int right= rows-1;
            while(left <= right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left ++;
                right --;
            }
        }
        for(int[] row : matrix){
            System.out.print(Arrays.toString(row));
        }
    }
}
