package arrays_2d;
import java.util.*;

public class flipping_image {
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
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    matrix[i][j] = 1;
                }
                else if(matrix[i][j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println();
        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=0;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
     }
}
