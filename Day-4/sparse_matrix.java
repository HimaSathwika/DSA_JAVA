package Arrays_2D;
import java.util.*;

import String;
public class sparse_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int zero_count =0,count= 0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0){
                    zero_count ++;
                }
            }
        }
        int total = rows * cols;
        if(zero_count > total /2){
            System.out.println("Sparse matrix");
        }
        else{
            System.out.println("Not a sparse matrix");
        }
    }
}
