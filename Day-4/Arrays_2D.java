package arrays_2d;
import java.util.*;
public class Arrays_2D{
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
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] row:matrix){
            for (int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        for(int row[] :matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}