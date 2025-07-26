package arrays_2d;
import java.util.*;

public class Diagonal_diff{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonal1_sum = 0,diagonal2_sum = 0;
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (i == j){
                    diagonal1_sum += matrix[i][j];
                }
                if (i+j == rows-1){
                    diagonal2_sum += matrix[i][j];
                }
            }
        }
        System.out.print(diagonal2_sum - diagonal1_sum);
    }
}