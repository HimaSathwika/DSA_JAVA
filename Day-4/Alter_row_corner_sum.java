package arrays_2d;
import java.util.*;
public class Alter_row_corner_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int m=(rows+1)/2;
        int[][] result = new int[m][cols];
        int r = 0;
        for(int i=0;i<rows;i+=2){
            for(int j=0;j<cols;j++){
                result[r][j] = matrix[i][j];
            }
            r++;
        }
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<cols;j++){
                if ((j%2 == 0)){
                    sum += result[i][j];
                }                
            }
        }
        System.out.println(sum);
    }
}
