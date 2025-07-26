package arrays_2d;
import java.util.*;
public class column_reverse {
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
            int up =0;
            int down= rows-1;
            while(up <= down){
                int temp = matrix[up][i];
                matrix[up][i] = matrix[down][i];
                matrix[down][i] = temp;
                up ++;
                down --;
            }
        }
        for(int[] row : matrix){
            System.out.print(Arrays.toString(row));
        }
    }
}
