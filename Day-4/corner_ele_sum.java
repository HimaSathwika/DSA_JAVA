package arrays_2d;
import java.util.*;
public class corner_ele_sum {
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
        int add =0 ;
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                add = matrix[0][0] + matrix[0][cols-1] + matrix[rows-1][0] + matrix[rows-1][cols-1];
            }
        }
        System.out.println(add);
    }
}
