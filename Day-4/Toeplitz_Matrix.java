package Arrays_2D;
import java.util.*;

import String;
public class Toeplitz_Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean result = true;
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols-1;j++){
                if(i == j){  
                    if(matrix[i][j] != matrix[i+1][j+1]){
                        result = false;
                    }
                }
            }
        }
        System.out.println(result);
     }
}
